class Solution {
    public int trailingZeroes(int n) {

        int count = 0;

        while (n >= 5) { //n =  100, 20, 
            n = n / 5;   //n =   20,  4,
            count += n;  //cnt = 20, 24, so 24 is ans for 100!
        }

        return count;
    }
}
/*
bade digit ka factorial nikalne me int ya long kuch bhi data type usko store nhi kr payega 

so we will apply another methoud ->
so jaise 5 ka factorial nikalne me usme 1 baar 5 aata hai to jitne baar 5 aayega utna ans hojaega

jaise 10 ka factorial nikalne me 2 baar 5 aata hai 
1*2*3*4*5*6*7*8*9*10
so      5 and 10 can be written as 2*5 
so here we are getting 5 for 2 times our final answer is 2; for 10!
*/