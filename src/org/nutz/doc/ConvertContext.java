package org.nutz.doc;

import org.nutz.lang.Strings;
import org.nutz.lang.util.LinkedArray;

public class ConvertContext {

	private String src;

	private String dest;

	private String indexml;

	private DocSetParser parser;

	private DocSetRender render;

	public DocSetParser getParser() {
		return parser;
	}

	public void setParser(DocSetParser parser) {
		this.parser = parser;
	}

	public DocSetRender getRender() {
		return render;
	}

	public void setRender(DocSetRender render) {
		this.render = render;
	}

	private LinkedArray<String> args;

	public ConvertContext() {
		args = new LinkedArray<String>(10);
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		src = src.replace('\\', '/');
		this.src = src.endsWith("/") ? src : src + "/";
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		dest = dest.replace('\\', '/');
		this.dest = dest.endsWith("/") ? dest : dest + "/";
	}

	public String getIndexml() {
		return Strings.isBlank(indexml) ? "index.xml" : indexml;
	}

	public void setIndexml(String indexml) {
		this.indexml = indexml;
	}

	public String getArg(int index) {
		return args.get(index);
	}

	public int getArgCount() {
		return args.size();
	}

	public void addArg(String arg) {
		args.push(arg);
	}

}
