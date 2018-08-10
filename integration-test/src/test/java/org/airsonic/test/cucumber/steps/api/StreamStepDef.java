package org.airsonic.test.cucumber.steps.api;

import cucumber.api.java8.En;
import org.airsonic.test.cucumber.server.AirsonicServer;
import org.apache.commons.io.HexDump;
import org.apache.commons.lang.NotImplementedException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.nio.file.Paths;
import java.security.MessageDigest;

public class StreamStepDef implements En {

    private CloseableHttpResponse response;
    private CloseableHttpClient client;

    public StreamStepDef(AirsonicServer server) {
        this.client = HttpClientBuilder.create().build();
        Given("Media file (.*) is added", (String mediaFile) -> {
            // TODO fix this
            server.uploadToDefaultMusicFolder(
                    Paths.get(this.getClass().getResource("/blobs/stream/piano").toURI()),
                    "");
        });

        When("A stream request is sent", () -> {
            RequestBuilder builder = RequestBuilder.create("GET").setUri(server.getBaseUri() + "/rest/stream");
            builder.addParameter("id", "2");
            builder.addHeader("Range", "bytes=0-");
            builder.addHeader("Accept", "audio/webm,audio/ogg,audio/wav,audio/*;");
            server.addRestParameters(builder);
            response = client.execute(builder.build());

            byte[] body = EntityUtils.toByteArray(response.getEntity());
        });

        Then("The response should have some bytes", () -> {
            throw new NotImplementedException();
        });


    }

}
