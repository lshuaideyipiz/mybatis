package edu.nf.homeWork.test;

import edu.nf.homeWork.entity.Pepole;
import edu.nf.homeWork.entity.extend.Man;
import edu.nf.homeWork.entity.extend.Woman;
import org.junit.Test;

public class PepoleTest {

    @Test
    public void sayTest(){
        Pepole pepole = new Man();
        pepole.say();
        pepole = new Woman();
        pepole.say();
    }

}
