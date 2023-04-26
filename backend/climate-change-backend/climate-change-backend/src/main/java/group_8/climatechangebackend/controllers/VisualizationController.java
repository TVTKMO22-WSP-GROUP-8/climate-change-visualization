// File name: VisualizationController.java
package group_8.climatechangebackend.controllers;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import group_8.climatechangebackend.exception.ResourceNotFoundException;
import group_8.climatechangebackend.exception.UsernameNotFoundException;
import group_8.climatechangebackend.models.User;
import org.springframework.security.core.context.SecurityContextHolder;
import group_8.climatechangebackend.models.VisualizationView;
import group_8.climatechangebackend.repositories.UserRepository;
import group_8.climatechangebackend.repositories.VisualizationViewRepository;
import org.springframework.security.core.annotation.AuthenticationPrincipal;


@RestController
@RequestMapping("/api/visualization")
public class VisualizationController {

    @Autowired
    private VisualizationViewRepository visualizationViewRepository;

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/create")
    public ResponseEntity<VisualizationView> createVisualizationView(@RequestBody VisualizationView view, Principal principal) {
        User user = userRepository.findByUsername(principal.getName())
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));

        view.setUser(user);
        VisualizationView createdView = visualizationViewRepository.save(view);
        return ResponseEntity.ok(createdView);
    }

    @GetMapping("/visualizations")
public ResponseEntity<List<VisualizationViewDTO>> getVisualizationViewsForUser(@AuthenticationPrincipal UserDetails userDetails) {
    if (userDetails == null) {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
        String username = userDetails.getUsername();
        User user = userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User not found"));
    
        List<VisualizationView> visualizationViews = visualizationViewRepository.findByUser(user);
        List<VisualizationViewDTO> visualizationViewDtos = new ArrayList<>();
        for (VisualizationView visualizationView : visualizationViews) {
            VisualizationViewDTO dto = new VisualizationViewDTO();
            dto.setId(visualizationView.getId());
            dto.setName(visualizationView.getName());
            dto.setUrlIdentifier(visualizationView.getUrlIdentifier());
            dto.setLayout(visualizationView.getLayout());
            dto.setDescription(visualizationView.getDescription());
            visualizationViewDtos.add(dto);
        }
        return ResponseEntity.ok(visualizationViewDtos);
    }
    
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteVisualizationView(@PathVariable("id") Integer id, Principal principal) {
        User user = userRepository.findByUsername(principal.getName())
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));

        VisualizationView view = visualizationViewRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Visualization view not found"));

        if (!view.getUser().equals(user)) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
        }

        visualizationViewRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
