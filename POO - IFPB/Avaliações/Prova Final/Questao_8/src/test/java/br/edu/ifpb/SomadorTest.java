package br.edu.ifpb;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Assert;
import org.junit.Test;

public class SomadorTest {
    @Test
    public void testSoma(){//O nome do método precisa ser test+NomedaClasseTestada
        Somador s = new Somador();//Instancia a classe somado
        assertArrayEquals(new int[]{5, 7, 9}, s.Soma(new int[]{5, 2, 3}));//cria um array com os valores esperados na saída e cria um setando os valores de entrada
        assertArrayEquals(new int[]{8, 12, 16, 20, 24}, s.Soma(new int[]{8, 4, 5}));
    }


}
