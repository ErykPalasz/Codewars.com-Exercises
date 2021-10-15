package codewars.com.kyu6;

// todo: klasa ma być nazwana "User"
public class CodewarsStyleRankingSystem {
    
    private int indexRanga;
    private int exp;
    private int[] kyu = {-8, -7, -6, -5, -4, -3, -2, -1, 1, 2, 3, 4, 5, 6, 7, 8};
    
    public int rank;
    public int progress;
    
    public CodewarsStyleRankingSystem() {
        this.indexRanga = 0;
        this.exp = 0;
        
        this.rank = -8;
        this.progress = 0;
    }
    
    private int getIndexRanga() {
        return this.indexRanga;
    }
    
    /**
     * @param kata kyu rank of activity
     * @return index of kyu in internal kyu array
     */
    private int getKataRankIndex(int kata) {
        
        for (int i = 0; i < this.kyu.length; i++) {
            if (this.kyu[i] == kata) {
                return i;
            }
        }
        return -1;
    }
    
    /**
     * increments user rank by 1
     */
    private void incRank() {
        if (getRank() < 8) {
            this.indexRanga += 1;
            this.rank = this.getRank();
        }
    }
    
    private void setProgress(int exp) {
        this.exp = exp;
        this.progress = this.getProgress();
    }
    
    /**
     * returns diffrence between user rank and activity rank
     * but output needs some handling.
     * 
     * -2 means 0 points
     * -1 means 1 point
     * 0 means 3 points
     * 
     * @param kataKyu rank of activity. NOT its index
     * @return D for points formula (10 * D * D)
     */
    private int rankDiff(int kataKyu) {
        
        int activity = getKataRankIndex(kataKyu);
        int userRank = getIndexRanga();
        int diff = Math.abs(userRank - activity);
        
        if (userRank > activity) {
            if (diff > 2) {
                return -2;
                
            } else if (diff == 1) {
                return -1;
            }
        } else if (diff == 0) {
            return 0;
        } else {
            return diff;
        }
        
        return -2;
    }
    
    /**
     * @return kyu rank of user. NOT index of said rank
     */
    public int getRank() {
        return this.kyu[this.getIndexRanga()];
    }
    
    /**
     * @return current exp value
     */
    public int getProgress() {
        return this.exp;
    }
    
    public void incProgress(int kata) throws IllegalArgumentException {
        
        IllegalArgumentException jebacDisa = new IllegalArgumentException();
        
        if (getKataRankIndex(kata) == -1) {
            throw jebacDisa;
        }
        
        int points = 0;
        
        if (rankDiff(kata) == -2) {
            points = 0;
        } else if (rankDiff(kata) == -1) {
            points = 1;
        } else if (rankDiff(kata) == 0) {
            points = 3;
        } else {
            points = 10 * rankDiff(kata) * rankDiff(kata);
        }
        
        setProgress(points + getProgress());
        
        while (getProgress() >= 100) {
            incRank();
            setProgress(getProgress() - 100);
        }
        
        if (getRank() == 8) {
            setProgress(0);
        }
        
    }
}
