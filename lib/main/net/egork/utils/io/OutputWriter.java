package net.egork.utils.io;

import net.egork.collections.intcollection.IntCollection;
import net.egork.collections.intcollection.IntIterator;

import java.io.*;

/**
 * @author Egor Kulikov (egor@egork.net)
 */
public class OutputWriter {
	private final PrintWriter writer;

	public OutputWriter(OutputStream outputStream) {
		writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
	}

	public OutputWriter(Writer writer) {
		this.writer = new PrintWriter(writer);
	}

	public void print(Object...objects) {
		for (int i = 0; i < objects.length; i++) {
			if (i != 0)
				writer.print(' ');
			writer.print(objects[i]);
		}
	}

    public void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i != 0)
                writer.print(' ');
            writer.print(array[i]);
        }
    }

	public void print(IntCollection collection) {
		boolean first = true;
		for (IntIterator iterator = collection.iterator(); iterator.isValid(); iterator.advance()) {
			if (first)
				first = false;
			else
				writer.print(' ');
			writer.print(iterator.value());
		}
	}

	public void printLine(int[] array) {
        print(array);
        writer.println();
    }

	public void printLine(IntCollection collection) {
		print(collection);
		writer.println();
	}

    public void printLine(Object...objects) {
		print(objects);
		writer.println();
	}

	public void printLine(char[] array) {
		writer.println(array);
	}

	public void printFormat(String format, Object...objects) {
		writer.printf(format, objects);
	}

	public void close() {
		writer.close();
	}

	public void flush() {
		writer.flush();
	}
}