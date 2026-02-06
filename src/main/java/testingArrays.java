public class testingArrays implements IIntArray{

    public int[] Zarray;
/*
 public testingArrays(int[] Zarray) {
        this.Zarray = Zarray;
    };
 */

    @Override
    public double getAverage() {
        if (Zarray == null) {
            throw new IllegalArgumentException("Null array not allowed");
        }
        if (Zarray.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        int sum = 0;
        for (int i = 0; i < Zarray.length; i++){
            if (Zarray[i] < 0){
                throw new IllegalArgumentException("Negative numbers not allowed");
            }

        sum += Zarray[i];
        }
        return (double) sum/ Zarray.length;
    }

    @Override
    public int[] findPositions(int val) {
        // Räkna hur många gånger 'val' finns för att veta hur stor resultat-arrayen ska vara

        int count = 0;
        for (int i = 0; i < Zarray.length; i++) {
            if (Zarray[i] == val) {
                count++;
            }
        }

        // Skapa den nya arrayen med rätt storlek
        int[] positions = new int[count];
        int index = 0;
        //fyll i
        for (int i = 0; i < Zarray.length; i++) {
            if (Zarray[i] == val) {
                positions[index++] = i;
            }
        }

        Zarray = positions;
        if (positions.length == 0) {
            throw new IllegalArgumentException("No positions found");
        }
        return positions;
    }

    @Override
    public void appendLast(int value) {
         int[] newArray  = new int[Zarray.length + 1];
         for (int i = 0; i < Zarray.length; i++) {
             newArray[i] = Zarray[i];
         }
         newArray[newArray.length-1] = value;
         Zarray = newArray;
    }

    @Override
    public void insertAt(int pos, int value) {
        // 1. Validera positionen (kasta exception om den är negativ)
        if (pos < 0) {
            throw new IllegalArgumentException("Position cannot be negative: " + pos);
        }

        // 2. Kontrollera att positionen finns i arrayen
        if (pos >= Zarray.length) {
            throw new IndexOutOfBoundsException("Position " + pos + " is out of bounds");
        }

        Zarray[pos] = value;
    }

    @Override
    public int getAt(int pos) {
        if (pos < 0) {
            throw new IllegalArgumentException("Position cannot be negative: " + pos);
        }
        for(int i = 0; i < Zarray.length; i++) {
            if (Zarray[i] == pos) {
                return Zarray[pos];
            }
        }
        if (pos >= Zarray.length) {
            throw new IndexOutOfBoundsException("Position " + pos + " is out of bounds");
        }
        return Zarray[pos];
    }

    @Override
    public void setAt(int pos, int element) {
        if (pos < 0) {
            throw new IllegalArgumentException("Position cannot be negative: " + pos);
        }
        Zarray[pos] = element;
        return;
    }

    @Override
    public int deleteAt(int pos) {
    Zarray[pos] = 0;
    return pos;
    }
}

