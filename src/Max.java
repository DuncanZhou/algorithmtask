/**
 * Created by lzj on 2016/11/2.
 * �������е����ֵ
 */
public class Max {

    /**
     * �ݹ�����������ʼλ�ÿ�ʼ�����ֵ
     * @param a ����
     * @param i ��ʼλ��
     * @return
     */
    public static double max(double[] a,int i){
        if(i == a.length-1)
            return a[i];
        double max = max(a, i + 1);
        if(a[i] > max)
            return a[i];
        else
            return max;
    }


    public static void main(String[] args) {
        System.out.println(max(new double[]{1,3,5.7,2,-100,2321},0));
        System.out.println(max(new double[]{-1,111,5.7,1111111,-100,2321},0));
        System.out.println(max(new double[]{21321312,3,5.7,2,-100,2321},0));
    }
}
