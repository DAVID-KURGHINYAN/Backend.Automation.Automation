package delivaryModules.dispatcher.controller;

import delivaryModules.dispatcher.services.DispatcherService;
import org.junit.Test;

public class DispatcherController {
    private final DispatcherService dispatcherService;

    public DispatcherController(){
        dispatcherService = new DispatcherService();
    }
    @Test
    public void getCarrierList(){
        dispatcherService.getCarrierListService();
    }

}
