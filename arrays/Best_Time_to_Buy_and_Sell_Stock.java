class Best_Time_to_Buy_and_Sell_Stock{
    public static int bestTimetoBuyandSellStock(int[] arr){
        int mini=arr[0];
        int maxprofit=0;
        for(int i=1;i<arr.length;i++){
            int cost=arr[i]-mini;
            maxprofit=Math.max(maxprofit,cost);
            mini=Math.min(mini,arr[i]);
        }
        return maxprofit;
    }
    public static  void main(String[] args){
        int[] arr={7,1,5,3,6,5};
        System.out.println(bestTimetoBuyandSellStock(arr));
    }
}

//Time complexity= O(n)
//Space commplexity= O(1)