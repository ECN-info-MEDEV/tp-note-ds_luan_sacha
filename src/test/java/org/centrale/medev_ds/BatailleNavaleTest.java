package org.centrale.medev_ds;

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
public class BatailleNavaleTest {
    
    public BatailleNavaleTest() {
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

    @Test
    public void testInit() {
        System.out.println("TEST init()");
        BatailleNavale b = new BatailleNavale();
        b.init();
        assertNotNull(b.getJ1().getListeBateau());
        assertNotNull(b.getJ2().getListeBateau());
    }

    @Test
    public void testPlacementNavires() {
        BatailleNavale b = new BatailleNavale();
        Joueur j = new Joueur();
        b.placementNavires(j);
        assertNotNull(j.getListeBateau());
        assertFalse(j.getListeBateau().isEmpty()); 
    }

    @Test
    public void testAfficheGrilleBateau() {
        Joueur j = new Joueur();
        BatailleNavale b = new BatailleNavale();
        b.afficheGrilleBateau(j, b.getTailleGrille()); 

    }

    @Test
    public void testTourDeJeu() {
        Joueur j = new Joueur();
        boolean result = BatailleNavale.tourDeJeu(j);
        assertTrue(result); 
    }
}
