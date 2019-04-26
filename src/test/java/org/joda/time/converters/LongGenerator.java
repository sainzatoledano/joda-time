package org.joda.time.converters;

import java.util.Arrays;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

public class LongGenerator extends Generator<Long> {

	public LongGenerator() {
		  super(Arrays.asList(Long.class, long.class));

	}

	public Long generate(SourceOfRandomness random, GenerationStatus status) {
		return random.nextLong(0, 1556216535033L);
	}

}
