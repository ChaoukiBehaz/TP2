import Exo1.Calculatrice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class CalculatriceTest {

    @Mock
    private Calculatrice calculatrice;

    @Test
    public void testAdditionner() {
        // Définition du comportement de la méthode "additionner" 
        when(calculatrice.additionner(2, 3)).thenReturn(5);

        //Appel de la méthode à tester
        int result = calculatrice.additionner(2,3);

        //Vérification du résultat
        assert result == 5;

// Vérification que la méthode "additionner" a été appelée
// avec les arguments 2 et 3, utiliser la directive « verify »
        verify(calculatrice).additionner(2, 3);


//Vérification qu'aucune autre méthode n'a été appelée sur
//l'objet après l'appel de la méthode "additionner", utiliser la 
// méthode « verifyNoMoreInteractions »
        verifyNoMoreInteractions(calculatrice);

// Vérification de l'état de l'objet après l'appel de la
//méthode "additionner", penser à utiliser la méthode 
//« getState() » de la directive « verify » : // exemple : 
       // verify(calculatrice).getState();
    }
}