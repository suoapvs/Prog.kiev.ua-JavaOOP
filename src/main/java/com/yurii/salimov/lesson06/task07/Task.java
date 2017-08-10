package com.yurii.salimov.lesson06.task07;

import java.math.BigInteger;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class Task implements Runnable {

    private final BigInteger start;
    private final BigInteger end;
    private final IFinish finish;

    public Task(final BigInteger start, final BigInteger end, final IFinish finish) {
        this.start = start;
        this.end = end;
        this.finish = finish;
    }

    private BigInteger fact(final BigInteger start) {
        if (start.equals(this.end)) {
            return this.end;
        } else {
            final BigInteger temp = fact(start.subtract(BigInteger.ONE));
            return start.multiply(temp);
        }
    }

    @Override
    public void run() {
        final BigInteger res = fact(this.start);
        if (this.finish != null) {
            this.finish.done(res);
        }
    }


    public BigInteger getStart() {
        return start;
    }

    public BigInteger getEnd() {
        return end;
    }
}
