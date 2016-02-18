package retrofit;


import java.io.IOException;
import java.lang.annotation.Retention;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import okio.Buffer;


import retrofit2.*;
import retrofit2.http.GET;
import retrofit2.http.Query;

import static java.lang.annotation.RetentionPolicy.RUNTIME;


public class JsonQueryParameters {
    @Retention(RUNTIME)
    @interface Json {
    }

    static class JsonStringConverterFactory extends Converter.Factory{
        private final Converter.Factory delegateFactory;

        JsonStringConverterFactory(Converter.Factory delegateFactory) {
            this.delegateFactory = delegateFactory;
        }

//        public retrofit2.Converter<?, String> stringConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
//            for (Annotation annotation : annotations) {
//                if (annotation instanceof Json) {
//                    // NOTE: If you also have a JSON converter factory installed in addition to this factory,
//                    // you can call retrofit.requestBodyConverter(type, annotations) instead of having a
//                    // reference to it explicitly as a field.
//                    Converter<?, RequestBody> delegate =
//                            delegateFactory.requestBodyConverter(type, annotations, new Annotation[0],retrofit);
//
//
//
//                    return new DelegateToStringConverter<>(delegate);
//                }
//            }
//            return null;
//        }


        static class DelegateToStringConverter<T> implements Converter<T, String> {
            private final Converter<T, RequestBody> delegate;

            DelegateToStringConverter(Converter<T, RequestBody> delegate) {
                this.delegate = delegate;
            }

            @Override public String convert(T value) throws IOException {
                Buffer buffer = new Buffer();
                delegate.convert(value).writeTo(buffer);
                return buffer.readUtf8();
            }
        }
    }

    static class Filter {
        public final String userId;

        public Filter(String userId) {
            this.userId = userId;
        }
    }

    interface Service {
        @GET("/filter")
        Call<ResponseBody> example(@Json @Query("value") Filter value);
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("About to start some server");
//        MockWebServer server = new MockWebServer();
//        server.start();
//        server.enqueue(new MockResponse());

//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl(server.url("/"))
//                .addConverterFactory(new JsonStringConverterFactory(GsonConverterFactory.create()))
//                .build();
//        Service service = retrofit.create(Service.class);

//        Call<ResponseBody> call = service.example(new Filter("123"));
//        Response<ResponseBody> response = call.execute();
        // TODO handle user response...
//        System.out.println(response);

        // Print the request path that the server saw to show the JSON query param:
//        RecordedRequest recordedRequest = server.takeRequest();
//        System.out.println(recordedRequest.getPath());
//        System.out.println("Hmmm");

//        server.shutdown();
    }
}