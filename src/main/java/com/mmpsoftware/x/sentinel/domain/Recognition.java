package com.mmpsoftware.x.sentinel.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author ffazil
 * @since 05/12/15
 */
public class Recognition {

    protected String utterance;
    protected List<Word> words = new ArrayList<>(0);
    protected String id;
    protected String engine;
    protected String context;
    protected String acousticModel;
    protected Date recognizedDateTime;
    protected Short processingMs;
    protected String recogResult;

    private Recognition(){

    }

    public String getUtterance() {
        return utterance;
    }

    public List<Word> getWords() {
        return words;
    }

    public String getId() {
        return id;
    }

    public String getEngine() {
        return engine;
    }

    public String getContext() {
        return context;
    }

    public String getAcousticModel() {
        return acousticModel;
    }

    public Date getRecognizedDateTime() {
        return recognizedDateTime;
    }

    public Short getProcessingMs() {
        return processingMs;
    }

    public String getRecogResult() {
        return recogResult;
    }
}
