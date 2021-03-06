package cydep;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Formatter;
import org.junit.Test;

public class TryMeteredImage {

    @Test
    public void tryMeteredImage() throws IOException {
        final String name = "Level3_KDVN_DPR_20130418_0408";
        final String imageFormat = "png";
        final String pathname = Resources.getFileResourceAsPathname(name + ".nids");
        PrintStream out = System.out;
        Formatter f = new Formatter(out);
        Cydep1 cydep = new Cydep1(pathname, f);
        File outDir = new File(cydep.getPathname()).getParentFile();
        File imageFile = new File(outDir, name + "." + imageFormat);
        cydep.drawToMeteredImage(imageFile, imageFormat);
    }
}
