public class StringMerger {

    public static boolean isMerge(String s, String part1, String part2) {
        if(part1 == "" && s.equals(part2) || part2 == "" && s.equals(part1))
            return true;
        else if(part1 == ""|| part2 == "" || s == "")
            return false;

        if(part1.charAt(0) == s.charAt(0) && part2.charAt(0) == s.charAt(0)) {
            return isMerge(s.substring(1, s.length()), part1.substring(1, part1.length()), part2)
                    || isMerge(s.substring(1, s.length()), part1, part2.substring(1, part2.length()));
        }
        else if(part1.charAt(0) == s.charAt(0)) {
            return isMerge(s.substring(1, s.length()), part1.substring(1, part1.length()), part2);
        }
        else if(part2.charAt(0) == s.charAt(0)) {
            return isMerge(s.substring(1, s.length()), part1, part2.substring(1, part2.length()));
        }
        return false;
    }

}