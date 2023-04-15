package group_8.climatechangebackend.config;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.web.servlet.resource.AbstractResourceResolver;
import org.springframework.web.servlet.resource.ResourceResolverChain;
import org.springframework.stereotype.Component;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;


@Component
public class ReactAppResourceResolver extends AbstractResourceResolver {

    @Override
    protected Resource resolveResourceInternal(HttpServletRequest request, String requestPath, List<? extends Resource> locations, ResourceResolverChain chain) {
        return resolveFromLocations(requestPath, locations);
    }

    @Override
    protected String resolveUrlPathInternal(String resourceUrlPath, List<? extends Resource> locations, ResourceResolverChain chain) {
        Resource resource = resolveFromLocations(resourceUrlPath, locations);
        return resource != null ? resourceUrlPath : null;
    }

    private Resource resolveFromLocations(String requestPath, List<? extends Resource> locations) {
        for (Resource location : locations) {
            try {
                Resource resource = new UrlResource(location.getURL().toString() + "index.html");
                if (resource.exists() && resource.isReadable()) {
                    return resource;
                }
            } catch (MalformedURLException e) {
                // Ignore the exception and move to the next location
            } catch (IOException e) {
                // Ignore the exception and move to the next location
            }
        }
        return null;
    }
}
