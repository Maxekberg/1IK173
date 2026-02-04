public class testingArrays implements IIntArray{

    public int[] array;
/*
 public testingArrays(int[] array) {
        this.array = array;
    };
 */

    @Override
    public double getAverage() {
        int sum = 0;
        for (int i = 0; i < array.length; i++){
        sum += array[i];
        }
        return (double) sum/array.length;
    }

    @Override
    public int[] findPositions(int val) {
        // Räkna hur många gånger 'val' finns för att veta hur stor resultat-arrayen ska vara
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == val) {
                count++;
            }
        }
        // Skapa den nya arrayen med rätt storlek
        int[] positions = new int[count];
        int index = 0;
        //fyll i
        for (int i = 0; i < array.length; i++) {
            if (array[i] == val) {
                positions[index++] = i;
            }
        }
        return positions;
    }

    @Override
    public void appendLast(int value) {
         int[] newArray  = new int[array.length + 1];
         for (int i = 0; i < array.length; i++) {
             newArray[i] = array[i];
         }
         newArray[newArray.length-1] = value;
         array = newArray;
    }

    @Override
    public void insertAt(int pos, int value) {
        for (int i = array.length - 1; i > pos; i--) {
            array[i] = array[i - 1];
        }
    }

    @Override
    public int getAt(int pos) {
        for(int i = 0; i < array.length; i++) {
            if (array[i] == pos) {
                return array[pos];
            }
        }
        return -1;
    }

    @Override
    public void setAt(int pos, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == pos) {
                array[i] = element;
            }
        }
    }

    @Override
    public int deleteAt(int pos) {
        return 0;
    }
}

