package enumpractice;

enum Operation {
ADD {
    public int apply(int x, int y) {
        return x + y;
    }
},
SUBSTRACT {
    public int apply(int x, int y) {
        return x - y;
    }
};
public abstract int apply (int x, int y);
}
