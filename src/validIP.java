public class validIP {
    private String range = "012345678abcdefABCDEF";

    public String validIPAddress(String IP) {
        if(IPv4(IP)){
            return "IPv4";
        }else if(IPv6(IP)){
            return "IPv6";
        }else{
            return "Neither";
        }
    }

    public boolean IPv4(String testIP){
        if(testIP.length()<7 || testIP.length()==0) return false;
        if(testIP.charAt(testIP.length()-1) == '.' || testIP.charAt(0) == '.') return false;
        String[] ipv4 = testIP.split("\\.");
        if(ipv4.length != 4) return false;
        for(String i:ipv4){
            System.out.println("test" + i);
            if(!isValidIPv4(i)) return false;
        }
        return true;
    }

    public boolean isValidIPv4(String single){
        if(single.length() == 0) return false;
        if(single.charAt(0) == '0' && single.length()>1) return false;
        try{
            Integer number = Integer.parseInt(single);
            if(number>255 || number<0) return false;
            if(number == 0 && single.charAt(0) != '0') return false;
        }catch(NumberFormatException e){
            return false;
        }
        return true;
    }

    public boolean IPv6(String testIP){
        if(testIP.length()<15 || testIP.length()==0) return false;
        if(testIP.charAt(testIP.length()-1) == ':' || testIP.charAt(0) == ':') return false;
        String[] ipv6 = testIP.split(":");
        if(ipv6.length != 8) return false;
        for(String i:ipv6){
            if(!isValidIPv6(i)) return false;
        }
        return true;
    }

    public boolean isValidIPv6(String single){
        if(single.length()>4 || single.length()==0) return false;
        char[] ch= single.toCharArray();
        for(char ch2:ch){
            if(!range.contains(String.valueOf(ch2))){
                return false;
            }
        }
        return true;
    }
}
