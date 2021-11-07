public class BonusMilesService {
    public int calculate (int price) {
        int rublesForOneBonusMile = 20;
        int miles = price / rublesForOneBonusMile;
        return miles;
    }
}
