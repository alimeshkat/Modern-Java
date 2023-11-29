import org.junit.jupiter.api.Test;

import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Tests {

  @Test
  void dogClassExists() throws ClassNotFoundException {
    Class<?> dogClass = Class.forName("Dog");
    assertNotNull(dogClass);
    assertTrue(dogClass.isSealed());
  }

  @Test
  void dogClassHasCorrectSignature() throws ClassNotFoundException {
    Class<?> dogClass = Class.forName("Dog");
    assertTrue(Modifier.isAbstract(dogClass.getModifiers()));
    assertTrue(dogClass.getSuperclass() == Object.class);
  }

  @Test
  void terrierClassExists() throws ClassNotFoundException {
    Class<?> terrierClass = Class.forName("Terrier");
    assertNotNull(terrierClass);
  }

  @Test
  void terrierClassHasCorrectSignature() throws ClassNotFoundException {
    Class<?> terrierClass = Class.forName("Terrier");
    assertTrue(terrierClass.getSuperclass().getSimpleName().equals("Dog"));
  }

  @Test
  void jackRussellTerrierClassExists() throws ClassNotFoundException {
    Class<?> jackRussellTerrierClass = Class.forName("JackRussellTerrier");
    assertNotNull(jackRussellTerrierClass);
  }

  @Test
  void jackRussellTerrierClassHasCorrectSignature() throws ClassNotFoundException {
    Class<?> jackRussellTerrierClass = Class.forName("JackRussellTerrier");
    assertTrue(jackRussellTerrierClass.getSuperclass().getSimpleName().equals("Terrier"));
  }

  @Test
  void foxTerrierClassExists() throws ClassNotFoundException {
    Class<?> foxTerrierClass = Class.forName("FoxTerrier");
    assertNotNull(foxTerrierClass);
  }

  @Test
  void foxTerrierClassHasCorrectSignature() throws ClassNotFoundException {
    Class<?> foxTerrierClass = Class.forName("FoxTerrier");
    assertTrue(foxTerrierClass.getSuperclass().getSimpleName().equals("Terrier"));
  }
}