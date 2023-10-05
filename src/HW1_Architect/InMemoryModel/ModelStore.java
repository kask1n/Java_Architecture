package HW1_Architect.InMemoryModel;

import HW1_Architect.ModelElements.Camera;
import HW1_Architect.ModelElements.Flash;
import HW1_Architect.ModelElements.PoligonalModel;
import HW1_Architect.ModelElements.Scene;

import java.util.List;

public class ModelStore implements IModelChanger {
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private List<IModelChangedObserver> changedObservers;

    public ModelStore(List<PoligonalModel> models, List<Scene> scenes, List<Flash> flashes, List<Camera> cameras, List<IModelChangedObserver> changedObservers) throws Exception {
        this.changedObservers = changedObservers;

        this.models = models;
        this.scenes = scenes;
        this.flashes = flashes;
        this.cameras = cameras;

//        this.models = new ArrayList<>();
//        this.scenes = new ArrayList<>();
//        this.flashes = new ArrayList<>();
//        this.cameras = new ArrayList<>();
//
//        models.add(new PoligonalModel(null));
//        flashes.add(new Flash());
//        cameras.add(new Camera());
//        scenes.add(new Scene(0, models, flashes, cameras));
    }

    public Scene getScene(int id) {
        for (Scene scene : scenes)
            if (scene.id == id)
                return scene;

        return null;
    }

    @Override
    public void NotifyChange(IModelChanger sender) {

    }
}
