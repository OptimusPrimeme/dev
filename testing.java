import static java.lang.Math.*;
public class testing {
    /* ������
     */
    public static final int NoChange = 16;
    enum Size {A,B,C,D};
    public static void main(String []args) {    
        double x = 0.58;
        int tested = (int)x;
        System.out.println(tested);//ǿ������ת��
        /**java�е�%Ϊȡ�����㣬������źͱ�������ͬ ,ȡģ��ͳ�����ͬ*/
        System.out.println(((-14)%NoChange));
        /**ȡģ��Ϊ���� */
        System.out.println(floorMod(2-4,NoChange));


        /**ö������ */
        Size s= Size.A;
        System.out.println(s);

        
        /**�ַ������� */
        String test = "testing";
        //�Ӵ�
        test = test.substring(1);
        String Add  ="test ed ";
        System.out.println(test+Add);
        //�ַ����ָ�
        String Split = String.join("/",test,Add);
        System.out.println(Split);
        /**���ɱ��ַ��� */
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
        /**���뵥Ԫ������� */
        // int CodePoint = test.codePointAt(0);
        // System.out.println(CodePoint);
        String toTest = test+"�Լ���\u1D546";//�������4���ֽ�
        System.out.println(toTest.length());
        System.out.println(toTest);
        if(test.indexOf("ing")!=1){
            System.out.println("�޷�ƥ���ַ���");
        }
        System.out.println(toTest.substring(3,13));
        System.out.println("\u1D546");

        //char�͵����ţ�string˫����
        char a = 't';
        System.out.println(a);
    }
        
    } 
