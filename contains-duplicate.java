class containsDuplicate {
    public static void main(String[] args) {
      containsDuplicate ins = new containsDuplicate();
      int[] arr = {1,2,3,1};
      System.out.println(ins.containsDuplicate(arr) == true);
      int[] arr2 = {1,2,3,4};
      System.out.println(ins.containsDuplicate(arr2) == false);
      int[] arr3 = {1,1,1,3,3,4,3,2,4,2};
      System.out.println(ins.containsDuplicate(arr3) == true);
      System.out.println("すべてTrueならコンプリート！");
    }

    public boolean containsDuplicate(int[] nums) {
        // ここにコードを書いてください
        return true;
    }
}