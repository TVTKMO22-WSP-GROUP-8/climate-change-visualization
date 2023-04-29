export default class VisualizationViewDTO {
  static fromEntity(entity) {
    return {
      id: entity.id,
      urlIdentifier: entity.urlIdentifier,
      layout: entity.layout,
      description: entity.description,
      datasets: entity.datasets || [],
    };
  }
}
