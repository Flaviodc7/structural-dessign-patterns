package Facade;

import java.io.File;

public class VideoConversionFacade {
    public File convertVideo(String fileName, String format){
        System.out.println("Converting video...");

        VideoFile file = new VideoFile(fileName);

        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;

        if (format.equalsIgnoreCase("mp4")){
            destinationCodec = new OggCompressionCodec();
        } else {
            destinationCodec = new MPEG4CompressionCodec();
        }

        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);

        File result = (new AudioMixer().fix(intermediateResult));
        System.out.println("Finished");
        return result;
    }
}
