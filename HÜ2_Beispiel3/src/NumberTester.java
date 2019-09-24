public class NumberTester {
    public NumberTester(String fileName){

    }

    public void setOddEvenTester(NumberTest oddTester){

    }

    public void setPrimeTester(NumberTest primeTester){

    }

    public void setPalindromeTester(NumberTest palindromeTester){

    }

    public void testFile(){
        NumberTest oddTester = (n) -> (n%2) == 0;
        setOddEvenTester(oddTester);

        NumberTest primeTester = (k) -> {
            for(int i =k-1; i > 1; i--){
                if(k%i == 0) return true;
            }
            return false;
        };
        setPrimeTester(primeTester);

        //NumberTest palindromeTester = (l) ->

    }

}
