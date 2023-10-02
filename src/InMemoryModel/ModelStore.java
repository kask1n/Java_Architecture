package InMemoryModel;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

import java.util.List;

public class ModelStore implements IModelChanger {
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private List<IModelChangedObserver> changedObservers;

    public ModelStore(List<PoligonalModel> models, List<Scene> scenes, List<Flash> flashes, List<Camera> cameras, List<IModelChangedObserver> changedObservers) {
        this.models = models;
        this.scenes = scenes;
        this.flashes = flashes;
        this.cameras = cameras;
        this.changedObservers = changedObservers;
    }

    public Scene getScene(int id) {
        return null;
    }

    @Override
    public void NotifyChange(IModelChanger sender) {

    }
}
