public class SubtractorTest {
   public void testSubtract() {
     Subtractor subtractor = new Subtractor();
     int result = subtractor.subtract(1,2);
     assert(result==-1);
   }
}
