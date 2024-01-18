package org.centrale.medev_ds;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author sacha
 */
public class BateauTest {
    
    public BateauTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of adicionarCoordenada method, of class Bateau.
     */
    @Test
    public void testAdicionarCoordenada() {
        System.out.println("adicionarCoordenada");
        int x = 1;
        int y = 1;
        Bateau b = new Bateau(2);
        Coordonnee c = new Coordonnee(x, y);
        b.adicionarCoordenada(x, y);
        assertTrue(b.getCoordenadas().contains(c), "Coordonnées non ajoutées correctement");
    }
    /**
     * Test of setPosition method, of class Bateau.
     */
    @Test
    public void testSetPosition() {
        System.out.println("setPosition");
        int x_debut = 0;
        int y_debut = 0;
        int x_fin = 0;
        int y_fin = 2;
        Bateau instance = new Bateau(3); // Assuming a boat of size 3
        instance.setPosition(x_fin, y_fin, x_debut, y_debut);
        List<Coordonnee> expectedCoordenadas = Arrays.asList(
                new Coordonnee(0, 0),
                new Coordonnee(0, 1),
                new Coordonnee(0, 2)
        );

        assertEquals(expectedCoordenadas, instance.getCoordenadas(), "Coordonnées non ajoutées correctement");
    }

}
