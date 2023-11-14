package kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.example.kyu8.BeginnerSeries1SchoolPaperwork;

public class BeginnerSeries1SchoolPaperworkTest {
    
    @Test
    public void test1(){
        assertEquals(25, BeginnerSeries1SchoolPaperwork.paperWork(5,5), "Failed at paperWork(5,5)");
    }

    @Test
    public void test2(){
        assertEquals(0, BeginnerSeries1SchoolPaperwork.paperWork(5,-5), "Failed at paperWork(5,-5)");
    }
    
    @Test
    public void test3(){
        assertEquals(0,BeginnerSeries1SchoolPaperwork.paperWork(-5,-5), "Failed at paperWork(-5,-5)");
    }
    
    @Test
    public void test4(){
        assertEquals(0,BeginnerSeries1SchoolPaperwork.paperWork(-5,5), "Failed at paperWork(-5,5)");
    }
    
    @Test
    public void test5(){
        assertEquals(0,BeginnerSeries1SchoolPaperwork.paperWork(5,0), "Failed at paperWork(5,0)");
    }
}