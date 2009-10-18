package org.mafc.blob;

import dynsim.graphics.AnimationFrame;

public class BlobViewer {
	public static void main(String[] args) {
		BlobScene s = new BlobScene(500, 300);
		s.insert(new Blob(8, new Vector2D(10, 12), new Vector2D(0, 1.2), 0.8));
		s.insert(new Blob(7, new Vector2D(60, 60), new Vector2D(0, 0), 1.875));
		s.insert(new Blob(6, new Vector2D(100, 10), new Vector2D(1.2, 1.2), 2.875));
		s.insert(new Blob(8, new Vector2D(12, 10), new Vector2D(1.2, 1.2), 0.875));
		s.insert(new Blob(20, new Vector2D(50, 50), new Vector2D(0, 0), 5.075));
		s.insert(new Blob(15, new Vector2D(30, 50), new Vector2D(0., 0), 0.88));
		s.insert(new Blob(9, new Vector2D(150, 50), new Vector2D(0., 0.15), 0.88));
		s.insert(new Blob(9, new Vector2D(151, 50), new Vector2D(0., 0.15), 0.88));
		s.insert(new Blob(9, new Vector2D(152, 50), new Vector2D(0., 0.15), 0.88));
		s.insert(new Blob(10, new Vector2D(146, 55), new Vector2D(0., 0.15), 0.88));
		s.insert(new Blob(5, new Vector2D(155, 52), new Vector2D(0., 0.15), 0.88));

		new AnimationFrame("Blob Scene [" + s + "]", s, false);
	}
}