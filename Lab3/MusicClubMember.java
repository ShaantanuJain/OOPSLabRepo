public interface MusicClubMember {
    default String printRClubName(){
        return "The Music Club is called Swaranjali";
    }
    public int memberRankM();
    public String[] instr();
    public String[] style();
}
