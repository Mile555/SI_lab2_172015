import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Collection;
import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    private final SILab2 silab=new SILab2();

    @Test
    public void function() {

    }
    @Test
    void TheMinutesAreNotValidException(){
        assertThrows(RuntimeException.class,()->silab.function());
    }
    @Test
    void TheSecondsAreNotValidException(){

    }
    @Test
    void TheAngleIsGreaterThanTheMaximumException(){

    }
    @Test
    void TheAngleIsSmallerOrGreaterException(){

    }

}
