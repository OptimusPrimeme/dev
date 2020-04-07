import static java.lang.Math.*;
public class testing {
    /* 第三章
     */
    public static final int NoChange = 16;
    enum Size {A,B,C,D};
    public static void main(String []args) {    
        double x = 0.58;
        int tested = (int)x;
        System.out.println(tested);//强制类型转换
        /**java中的%为取余运算，结果符号和被除数相同 ,取模则和除数相同*/
        System.out.println(((-14)%NoChange));
        /**取模不为负数 */
        System.out.println(floorMod(2-4,NoChange));


        /**枚举类型 */
        Size s= Size.A;
        System.out.println(s);

        
        /**字符串类型 */
        String test = "testing";
        //子串
        test = test.substring(1);
        String Add  ="test ed ";
        System.out.println(test+Add);
        //字符串分割
        String Split = String.join("/",test,Add);
        System.out.println(Split);
        /**不可变字符串 */
        test = "changing";
        // if(test == "changing"){
        //     System.out.println("true");
        // }
        // if(test.substring(1)=="hanging"){
        //     System.out.println("true");
        // }//no true!!!
        // if(test.equals("changing")){
        //     System.out.println("true");
        // }
        System.out.println(test);
        /**代码单元，代码点 */
        // int CodePoint = test.codePointAt(0);
        // System.out.println(CodePoint);
        String toTest = test+"自己人\u1D546";//特殊符号4个字节
        System.out.println(toTest.length());
        System.out.println(toTest);
        if(test.indexOf("ing")!=1){
            System.out.println("无法匹配字符串");
        }
        System.out.println(toTest.substring(3,13));
        System.out.println("\u1D546");

        //char型单引号，string双引号
        char a = 't';
        System.out.println(a);
    }
        
    } 
