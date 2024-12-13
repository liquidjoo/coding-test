package deprecated.slipp.etc1;

public class GasStation {

    public void test() {
//        int[] a = {1,2,3,4,5};
//        int[] b = {3,4,5,1,2};

        int[] a = {2,3,4};
        int[] b = {3,4,3};

        final int i = canCompleteCircuit(a, b);

        System.out.println(i);
    }

    public int canCompleteCircuit(int[] gas, int[] cost) {

        for (int index = 0; index < gas.length; index++) {

            int totalGas = 0;

            for (int i = index; i < gas.length; i++) {
                totalGas += gas[i] - cost[i];
                if (totalGas < 0) {
                    break;
                }
            }

            for (int j = 0; j < index; j++) {
                if (totalGas < 0) {
                    break;
                }
                totalGas += gas[j] - cost[j];
            }


            if (totalGas >= 0) {
                return index;
            }
        }

        return  -1;
    }
}
