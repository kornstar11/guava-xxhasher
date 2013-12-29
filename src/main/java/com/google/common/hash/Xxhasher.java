package com.google.common.hash;
import net.jpountz.xxhash.*;

public class Xxhasher extends AbstractNonStreamingHashFunction{
	protected static int seed = 0x9747b28c;
	public static XXHashFactory factory = XXHashFactory.fastestInstance();
	public static XXHash32 hash32 = factory.hash32();
	
	public int bits() {
	    return 32;
	}
  
	public HashCode hashBytes(byte[] input,
                   int off,
                   int len) {
		int hash = hash32.hash(input, 0, input.length, seed);
		HashCode theCode = HashCode.fromInt(hash);
		return theCode;
	}
  
}
