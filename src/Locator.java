import com.pokegoapi.api.PokemonGo;

import java.util.concurrent.TimeUnit;

/**
 * Created by jsh3571 on 12/02/2017.
 */
public class Locator {
    private static PokemonGo go;

    public Locator(PokemonGo go) {
        this.go = go;
    }

    public void locate(Location location) {
        // Change current location to be the same as input.
        go.setLocation(
                location.getLatitude(),
                location.getLongitude(),
                location.getALTITUDE());

        try {
            // Waiting for map objects to be updated.
            TimeUnit.SECONDS.sleep(15);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}