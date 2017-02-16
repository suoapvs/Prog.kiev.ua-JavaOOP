package com.yurii.salimov.lesson12.task04.server;

import java.io.*;
import java.util.Date;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Date date;
    private String from;
    private String to;
    private transient String text;
    private transient String path;
    private boolean isFile;

    public Message() {
        this.date = new Date();
    }

    public Message(String from, String to, String text) {
        this();
        this.from = from;
        this.to = to;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Message{" +
                "date=" + this.date +
                ", from='" + this.from + '\'' +
                ", to='" + this.to + '\'' +
                ", text='" + this.text + '\'' +
                '}';
    }

    public void writeToStream(final OutputStream out) throws IOException {
        try (final ByteArrayOutputStream bs = new ByteArrayOutputStream();
             final ObjectOutputStream os = new ObjectOutputStream(bs);
             final DataOutputStream ds = new DataOutputStream(out)) {
            os.writeObject(this);
            if (!this.isFile) {
                os.writeUTF(this.text);
            }
            final byte[] packet = bs.toByteArray();
            ds.writeInt(packet.length);
            ds.write(packet);
            ds.flush();
        }
    }

    public Message readFromStream(final InputStream in) throws IOException, ClassNotFoundException {
        if (in.available() <= 0) {
            return null;
        }
        byte[] packet;
        try(final DataInputStream ds = new DataInputStream(in)) {
            int len = ds.readInt();
            packet = new byte[len];
            ds.read(packet);
        }
        try (final ByteArrayInputStream bs = new ByteArrayInputStream(packet);
             final ObjectInputStream os = new ObjectInputStream(bs)) {
            final Message message = (Message) os.readObject();
            if (!message.isFile) {
                message.text = os.readUTF();
            }
            init(message);
            return this;
        }
    }

    public Date getDate() {
        return this.date;
    }

    public String getFrom() {
        return this.from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return this.to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public boolean isFile() {
        return isFile;
    }

    public void setFile(boolean file) {
        this.isFile = file;
    }

    private void init(final Message message) {
        if(message != null) {
            this.from = message.from;
            this.to = message.to;
            this.text = message.text;
            this.path = message.path;
            this.isFile = message.isFile;
        }
    }
}
