package io.github.mikesaelim.arxivoaiharvester.model;

import org.junit.Test;
import org.mockito.internal.matchers.Null;

import static org.junit.Assert.*;

public class ResumeListRecordsRequestTest {

    @Test(expected = NullPointerException.class)
    public void nullResumptionTokenShouldThrow() throws Exception {
        new ResumeListRecordsRequest(null);
    }

    @Test
    public void testGetUri() throws Exception {
        String resumptionToken = "pie";

        ResumeListRecordsRequest request = new ResumeListRecordsRequest(resumptionToken);

        assertEquals("http://export.arxiv.org/oai2?verb=ListRecords&resumptionToken=pie", request.getUri().toString());
    }
}