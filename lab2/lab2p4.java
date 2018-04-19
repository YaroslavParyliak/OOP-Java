public class lab2p4 {

    public static void main(String[] args) {
        int[] array = {701, 273, 346, 685, 761, 932, 11, 432, 825, 276};
        int length = array.length;

        {
            for (int gap = length/2; gap > 0; gap /= 2)
            {

                for (int i = gap; i < length; i += 1)
                {

                    int temp = array[i];


                    int j;
                    for (j = i; j >= gap && array[j - gap] > temp; j -= gap)
                        array[j] = array[j - gap];

                    array[j] = temp;
                }
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}