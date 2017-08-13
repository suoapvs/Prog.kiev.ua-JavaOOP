package com.yurii.salimov.lesson12.task03;

import java.io.*;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class Message implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String from;
    private final String to;
    private final transient String text;

    public Message(final String from, final String to, final String text) {
        this.from = from;
        this.to = to;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Message{" +
                "from='" + this.from + '\'' +
                ", to='" + this.to + '\'' +
                ", text='" + this.text + '\'' +
                '}';
    }

    public void writeToStream(final OutputStream out) throws IOException {
        try (ByteArrayOutputStream bs = new ByteArrayOutputStream();
                ObjectOutputStream os = new ObjectOutputStream(bs);
                DataOutputStream ds = new DataOutputStream(out);) {
            os.writeObject(this);
            os.writeUTF(this.text);
            byte[] packet = bs.toByteArray();
            ds.writeInt(packet.length);
            ds.write(packet);
            ds.flush();
        }
    }

    public String getFrom() {
        return this.from;
    }

    public String getTo() {
        return this.to;
    }

    public String getText() {
        return this.text;
    }
}
