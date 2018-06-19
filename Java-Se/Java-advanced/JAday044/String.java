package JAday044;
//package JAday05;
//
//import java.util.Arrays;
//
//public class String implements java.io.Serializable, Comparable<String>, CharSequence{
//	java.lang.String str = "";
//	Object obj = "";
//	private final char value[];
//	private int hash; // Default to 0
//   
////	public String() {
////        this.value = "".value;
////    }
//	
//    public String(String original) {
//        this.value = original.value;
//        this.hash = original.hash;
//    }
//    public String(char value[]) {
//        this.value = Arrays.copyOf(value, value.length);
//    }
//    private static void checkBounds(byte[] bytes, int offset, int length) {
//        if (length < 0)
//            throw new StringIndexOutOfBoundsException(length);
//        if (offset < 0)
//            throw new StringIndexOutOfBoundsException(offset);
//        if (offset > bytes.length - length)
//            throw new StringIndexOutOfBoundsException(offset + length);
//    }
//	
//    String(char[] value, boolean share) {
//        // assert share : "unshared not supported";
//        this.value = value;
//    }
//	
//    public boolean isEmpty() {
//        return value.length == 0;
//    }
//    
//	@Override
//	public int length() {
//		return value.length;
//	}
//	@Override
//	public char charAt(int index) {
//		if ((index < 0) || (index >= value.length)) {
//            throw new StringIndexOutOfBoundsException(index);
//        }
//		return value[index];
//	}
//	
//	public boolean equals(Object anObject) {
//        if (this == anObject) {
//            return true;
//        }
//        if (anObject instanceof String) {
//            String anotherString = (String)anObject;
//            int n = value.length;
//            if (n == anotherString.value.length) {
//                char v1[] = value;
//                char v2[] = anotherString.value;
//                int i = 0;
//                while (n-- != 0) {
//                    if (v1[i] != v2[i])
//                        return false;
//                    i++;
//                }
//                return true;
//            }
//        }
//        return false;
//    }
//	@Override
//	public CharSequence subSequence(int start, int end) {
//		return null;
//	}
//	@Override
//	public int compareTo(String o) {
//		return 0;
//	}
//}
