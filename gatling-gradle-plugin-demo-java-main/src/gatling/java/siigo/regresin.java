package siigo;

import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class regresin extends Simulation {

  private HttpProtocolBuilder httpProtocol = http
    .baseUrl("https://reqres.in")
    .inferHtmlResources(AllowList(), DenyList(".*\\.js", ".*\\.css", ".*\\.gif", ".*\\.jpeg", ".*\\.jpg", ".*\\.ico", ".*\\.woff", ".*\\.woff2", ".*\\.(t|o)tf", ".*\\.png", ".*\\.svg", ".*detectportal\\.firefox\\.com.*"))
  ;
  
  private Map<CharSequence, String> headers_0 = Map.ofEntries(
    Map.entry("accept", "*/*"),
    Map.entry("accept-encoding", "gzip, deflate, br"),
    Map.entry("accept-language", "es-US,es-419;q=0.9,es;q=0.8"),
    Map.entry("dnt", "1"),
    Map.entry("sec-ch-ua", "Chromium\";v=\"110\", \"Not A(Brand\";v=\"24\", \"Google Chrome\";v=\"110"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-fetch-dest", "script"),
    Map.entry("sec-fetch-mode", "no-cors"),
    Map.entry("sec-fetch-site", "cross-site"),
    Map.entry("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.0.0 Safari/537.36")
  );
  
  private Map<CharSequence, String> headers_1 = Map.ofEntries(
    Map.entry("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7"),
    Map.entry("accept-encoding", "gzip, deflate, br"),
    Map.entry("accept-language", "es-US,es-419;q=0.9,es;q=0.8"),
    Map.entry("dnt", "1"),
    Map.entry("sec-ch-ua", "Chromium\";v=\"110\", \"Not A(Brand\";v=\"24\", \"Google Chrome\";v=\"110"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-fetch-dest", "document"),
    Map.entry("sec-fetch-mode", "navigate"),
    Map.entry("sec-fetch-site", "none"),
    Map.entry("sec-fetch-user", "?1"),
    Map.entry("upgrade-insecure-requests", "1"),
    Map.entry("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.0.0 Safari/537.36")
  );
  
  private Map<CharSequence, String> headers_6 = Map.ofEntries(
    Map.entry("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7"),
    Map.entry("accept-encoding", "gzip, deflate, br"),
    Map.entry("accept-language", "es-US,es-419;q=0.9,es;q=0.8"),
    Map.entry("dnt", "1"),
    Map.entry("sec-ch-ua", "Chromium\";v=\"110\", \"Not A(Brand\";v=\"24\", \"Google Chrome\";v=\"110"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-fetch-dest", "iframe"),
    Map.entry("sec-fetch-mode", "navigate"),
    Map.entry("sec-fetch-site", "cross-site"),
    Map.entry("upgrade-insecure-requests", "1"),
    Map.entry("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.0.0 Safari/537.36")
  );
  
  private Map<CharSequence, String> headers_7 = Map.ofEntries(
    Map.entry("DNT", "1"),
    Map.entry("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.0.0 Safari/537.36"),
    Map.entry("sec-ch-ua", "Chromium\";v=\"110\", \"Not A(Brand\";v=\"24\", \"Google Chrome\";v=\"110"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows")
  );
  
  private Map<CharSequence, String> headers_8 = Map.ofEntries(
    Map.entry("accept", "*/*"),
    Map.entry("accept-encoding", "gzip, deflate, br"),
    Map.entry("accept-language", "es-US,es-419;q=0.9,es;q=0.8"),
    Map.entry("dnt", "1"),
    Map.entry("origin", "https://codesandbox.io"),
    Map.entry("sec-ch-ua", "Chromium\";v=\"110\", \"Not A(Brand\";v=\"24\", \"Google Chrome\";v=\"110"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-fetch-dest", "empty"),
    Map.entry("sec-fetch-mode", "cors"),
    Map.entry("sec-fetch-site", "same-site"),
    Map.entry("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.0.0 Safari/537.36")
  );
  
  private Map<CharSequence, String> headers_11 = Map.ofEntries(
    Map.entry("accept", "*/*"),
    Map.entry("accept-encoding", "gzip, deflate, br"),
    Map.entry("accept-language", "es-US,es-419;q=0.9,es;q=0.8"),
    Map.entry("content-type", "text/plain;charset=UTF-8"),
    Map.entry("dnt", "1"),
    Map.entry("origin", "https://m.stripe.network"),
    Map.entry("sec-ch-ua", "Chromium\";v=\"110\", \"Not A(Brand\";v=\"24\", \"Google Chrome\";v=\"110"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-fetch-dest", "empty"),
    Map.entry("sec-fetch-mode", "cors"),
    Map.entry("sec-fetch-site", "cross-site"),
    Map.entry("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.0.0 Safari/537.36")
  );
  
  private Map<CharSequence, String> headers_12 = Map.ofEntries(
    Map.entry("accept", "*/*"),
    Map.entry("accept-encoding", "gzip, deflate, br"),
    Map.entry("accept-language", "es-US,es-419;q=0.9,es;q=0.8"),
    Map.entry("dnt", "1"),
    Map.entry("sec-ch-ua", "Chromium\";v=\"110\", \"Not A(Brand\";v=\"24\", \"Google Chrome\";v=\"110"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-fetch-dest", "empty"),
    Map.entry("sec-fetch-mode", "no-cors"),
    Map.entry("sec-fetch-site", "cross-site"),
    Map.entry("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.0.0 Safari/537.36")
  );
  
  private Map<CharSequence, String> headers_27 = Map.ofEntries(
    Map.entry("accept", "*/*"),
    Map.entry("accept-encoding", "gzip, deflate, br"),
    Map.entry("accept-language", "es-US,es-419;q=0.9,es;q=0.8"),
    Map.entry("dnt", "1"),
    Map.entry("origin", "https://j17lt.csb.app"),
    Map.entry("sec-ch-ua", "Chromium\";v=\"110\", \"Not A(Brand\";v=\"24\", \"Google Chrome\";v=\"110"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-fetch-dest", "empty"),
    Map.entry("sec-fetch-mode", "cors"),
    Map.entry("sec-fetch-site", "cross-site"),
    Map.entry("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.0.0 Safari/537.36")
  );
  
  private Map<CharSequence, String> headers_30 = Map.ofEntries(
    Map.entry("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8"),
    Map.entry("accept-encoding", "gzip, deflate, br"),
    Map.entry("accept-language", "es-US,es-419;q=0.9,es;q=0.8"),
    Map.entry("dnt", "1"),
    Map.entry("sec-ch-ua", "Chromium\";v=\"110\", \"Not A(Brand\";v=\"24\", \"Google Chrome\";v=\"110"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-fetch-dest", "image"),
    Map.entry("sec-fetch-mode", "no-cors"),
    Map.entry("sec-fetch-site", "same-origin"),
    Map.entry("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.0.0 Safari/537.36")
  );
  
  private Map<CharSequence, String> headers_31 = Map.ofEntries(
    Map.entry("accept", "*/*"),
    Map.entry("accept-encoding", "gzip, deflate, br"),
    Map.entry("accept-language", "es-US,es-419;q=0.9,es;q=0.8"),
    Map.entry("access-control-request-headers", "content-type"),
    Map.entry("access-control-request-method", "POST"),
    Map.entry("origin", "https://j17lt.csb.app"),
    Map.entry("sec-fetch-dest", "empty"),
    Map.entry("sec-fetch-mode", "cors"),
    Map.entry("sec-fetch-site", "cross-site"),
    Map.entry("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.0.0 Safari/537.36")
  );
  
  private Map<CharSequence, String> headers_32 = Map.ofEntries(
    Map.entry("accept", "application/json"),
    Map.entry("accept-encoding", "gzip, deflate, br"),
    Map.entry("accept-language", "es-US,es-419;q=0.9,es;q=0.8"),
    Map.entry("content-type", "application/json"),
    Map.entry("dnt", "1"),
    Map.entry("origin", "https://j17lt.csb.app"),
    Map.entry("sec-ch-ua", "Chromium\";v=\"110\", \"Not A(Brand\";v=\"24\", \"Google Chrome\";v=\"110"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-fetch-dest", "empty"),
    Map.entry("sec-fetch-mode", "cors"),
    Map.entry("sec-fetch-site", "cross-site"),
    Map.entry("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.0.0 Safari/537.36")
  );
  
  private String uri01 = "https://codesandbox.io";
  
  private String uri02 = "https://ab-testing.codesandbox.io/6268e60a-1b62-4931-89f4-1e5cda3993e2";
  
  private String uri03 = "https://prod-packager-packages.codesandbox.io/v2/packages";
  
  private String uri04 = "https://js.stripe.com/v3";
  
  private String uri06 = "https://m.stripe.com/6";
  
  private String uri07 = "https://j17lt.csb.app";
  
  private String uri08 = "https://avatars3.githubusercontent.com/u/868803";
  
  private String uri09 = "https://data.jsdelivr.com/v1/package/npm";
  
  private String uri10 = "https://col.csbops.io/data/sandpack";
  
  private String uri11 = "https://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/fonts/fontawesome-webfont.woff";
  
  private String uri12 = "https://raw.githubusercontent.com/SchemaStore/schemastore/master/src/schemas/json";
  
  private String uri13 = "https://m.stripe.network/inner.html";

  private ScenarioBuilder scn = scenario("regresin")
    .exec(
      http("request_0:GET_https://js.stripe.com/v3/")
        .get(uri04 + "/")
        .headers(headers_0)
        .check(bodyBytes().is(RawFileBody("siigo/regresin/0000_response.bin")))
        .resources(
          http("request_1:GET_https://reqres.in/")
            .get("/")
            .headers(headers_1)
            .check(bodyBytes().is(RawFileBody("siigo/regresin/0001_response.html"))),
          http("request_2:GET_https://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/fonts/fontawesome-webfont.woff?v=4.2.0")
            .get(uri11 + "?v=4.2.0"),
          http("request_3:GET_https://reqres.in/api/users?page=2")
            .get("/api/users?page=2")
            .check(bodyBytes().is(RawFileBody("siigo/regresin/0003_response.json"))),
          http("request_4:GET_https://js.stripe.com/v3/m-outer-93afeeb17bc37e711759584dbfc50d47.html")
            .get(uri04 + "/m-outer-93afeeb17bc37e711759584dbfc50d47.html")
            .check(bodyBytes().is(RawFileBody("siigo/regresin/0004_response.html"))),
          http("request_5:GET_https://m.stripe.network/inner.html")
            .get(uri13)
            .check(bodyBytes().is(RawFileBody("siigo/regresin/0005_response.html"))),
          http("request_6:GET_https://codesandbox.io/embed/polished-butterfly-j17lt?autoresize=1&fontsize=14&theme=dark&view=preview")
            .get(uri01 + "/embed/polished-butterfly-j17lt?autoresize=1&fontsize=14&theme=dark&view=preview")
            .headers(headers_6)
            .check(bodyBytes().is(RawFileBody("siigo/regresin/0006_response.html"))),
          http("request_7:GET_https://avatars3.githubusercontent.com/u/868803?v=4")
            .get(uri08 + "?v=4")
            .headers(headers_7)
            .check(bodyBytes().is(RawFileBody("siigo/regresin/0007_response.jpeg"))),
          http("request_8:GET_https://ab-testing.codesandbox.io/6268e60a-1b62-4931-89f4-1e5cda3993e2")
            .get(uri02)
            .headers(headers_8)
            .check(bodyBytes().is(RawFileBody("siigo/regresin/0008_response.json"))),
          http("request_9:GET_https://j17lt.csb.app/")
            .get(uri07 + "/")
            .headers(headers_6)
            .check(bodyBytes().is(RawFileBody("siigo/regresin/0009_response.html"))),
          http("request_10:GET_https://codesandbox.io/public/onigasm/2.2.1/onigasm.wasm")
            .get(uri01 + "/public/onigasm/2.2.1/onigasm.wasm")
            .check(bodyBytes().is(RawFileBody("siigo/regresin/0010_response.bin"))),
          http("request_11:POST_https://m.stripe.com/6")
            .post(uri06)
            .headers(headers_11)
            .body(RawFileBody("siigo/regresin/0011_request.json"))
            .check(bodyBytes().is(RawFileBody("siigo/regresin/0011_response.json"))),
          http("request_12:GET_https://j17lt.csb.app/")
            .get(uri07 + "/")
            .headers(headers_12),
          http("request_13:GET_https://data.jsdelivr.com/v1/package/npm/_babel/core")
            .get(uri09 + "/@babel/core")
            .headers(headers_7)
            .check(bodyBytes().is(RawFileBody("siigo/regresin/0013_response.json"))),
          http("request_14:GET_https://data.jsdelivr.com/v1/package/npm/_babel/runtime")
            .get(uri09 + "/@babel/runtime")
            .headers(headers_7)
            .check(bodyBytes().is(RawFileBody("siigo/regresin/0014_response.json"))),
          http("request_15:GET_https://prod-packager-packages.codesandbox.io/v2/packages/node-libs-browser/2.2.1.json")
            .get(uri03 + "/node-libs-browser/2.2.1.json")
            .headers(headers_7)
            .check(bodyBytes().is(RawFileBody("siigo/regresin/0015_response.json"))),
          http("request_16:GET_https://prod-packager-packages.codesandbox.io/v2/packages/react-refresh/0.9.0.json")
            .get(uri03 + "/react-refresh/0.9.0.json")
            .headers(headers_7)
            .check(bodyBytes().is(RawFileBody("siigo/regresin/0016_response.json"))),
          http("request_17:GET_https://prod-packager-packages.codesandbox.io/v2/packages/react/17.0.0.json")
            .get(uri03 + "/react/17.0.0.json")
            .headers(headers_7)
            .check(bodyBytes().is(RawFileBody("siigo/regresin/0017_response.json"))),
          http("request_18:GET_https://prod-packager-packages.codesandbox.io/v2/packages/react-dom/17.0.0.json")
            .get(uri03 + "/react-dom/17.0.0.json")
            .headers(headers_7)
            .check(bodyBytes().is(RawFileBody("siigo/regresin/0018_response.json"))),
          http("request_19:GET_https://prod-packager-packages.codesandbox.io/v2/packages/node-libs-browser/2.2.1.json")
            .get(uri03 + "/node-libs-browser/2.2.1.json")
            .check(bodyBytes().is(RawFileBody("siigo/regresin/0019_response.json"))),
          http("request_20:GET_https://prod-packager-packages.codesandbox.io/v2/packages/react/17.0.0.json")
            .get(uri03 + "/react/17.0.0.json")
            .check(bodyBytes().is(RawFileBody("siigo/regresin/0020_response.json"))),
          http("request_21:GET_https://prod-packager-packages.codesandbox.io/v2/packages/react-dom/17.0.0.json")
            .get(uri03 + "/react-dom/17.0.0.json")
            .check(bodyBytes().is(RawFileBody("siigo/regresin/0021_response.json"))),
          http("request_22:GET_https://prod-packager-packages.codesandbox.io/v2/packages/react-refresh/0.9.0.json")
            .get(uri03 + "/react-refresh/0.9.0.json")
            .check(bodyBytes().is(RawFileBody("siigo/regresin/0022_response.json"))),
          http("request_23:GET_https://prod-packager-packages.codesandbox.io/v2/packages/_babel/runtime/7.21.0.json")
            .get(uri03 + "/@babel/runtime/7.21.0.json")
            .headers(headers_7)
            .check(bodyBytes().is(RawFileBody("siigo/regresin/0023_response.json"))),
          http("request_24:GET_https://prod-packager-packages.codesandbox.io/v2/packages/_babel/runtime/7.21.0.json")
            .get(uri03 + "/@babel/runtime/7.21.0.json")
            .check(bodyBytes().is(RawFileBody("siigo/regresin/0024_response.json"))),
          http("request_25:GET_https://prod-packager-packages.codesandbox.io/v2/packages/_babel/core/7.21.0.json")
            .get(uri03 + "/@babel/core/7.21.0.json")
            .headers(headers_7)
            .check(bodyBytes().is(RawFileBody("siigo/regresin/0025_response.json"))),
          http("request_26:GET_https://prod-packager-packages.codesandbox.io/v2/packages/_babel/core/7.21.0.json")
            .get(uri03 + "/@babel/core/7.21.0.json")
            .check(bodyBytes().is(RawFileBody("siigo/regresin/0026_response.json"))),
          http("request_27:GET_https://codesandbox.io/api/v1/sandboxes/j17lt/phishing")
            .get(uri01 + "/api/v1/sandboxes/j17lt/phishing")
            .headers(headers_27)
            .check(bodyBytes().is(RawFileBody("siigo/regresin/0027_response.dat"))),
          http("request_28:GET_https://data.jsdelivr.com/v1/package/npm/react_17.0.0/flat")
            .get(uri09 + "/react@17.0.0/flat")
            .headers(headers_7)
            .check(bodyBytes().is(RawFileBody("siigo/regresin/0028_response.json"))),
          http("request_29:GET_https://reqres.in/api/users/")
            .get("/api/users/")
            .check(bodyBytes().is(RawFileBody("siigo/regresin/0029_response.json"))),
          http("request_30:GET_https://codesandbox.io/embed/polished-butterfly-j17lt?autoresize=1&fontsize=14&theme=dark&view=preview")
            .get(uri01 + "/embed/polished-butterfly-j17lt?autoresize=1&fontsize=14&theme=dark&view=preview")
            .headers(headers_30),
          http("request_31:OPTIONS_https://col.csbops.io/data/sandpack")
            .options(uri10)
            .headers(headers_31),
          http("request_32:POST_https://col.csbops.io/data/sandpack")
            .post(uri10)
            .headers(headers_32)
            .body(RawFileBody("siigo/regresin/0032_request.bin")),
          http("request_33:GET_https://raw.githubusercontent.com/SchemaStore/schemastore/master/src/schemas/json/package.json")
            .get(uri12 + "/package.json")
            .check(bodyBytes().is(RawFileBody("siigo/regresin/0033_response.txt"))),
          http("request_34:GET_https://raw.githubusercontent.com/SchemaStore/schemastore/master/src/schemas/json/prettierrc.json")
            .get(uri12 + "/prettierrc.json")
            .check(bodyBytes().is(RawFileBody("siigo/regresin/0034_response.txt"))),
          http("request_35:GET_https://raw.githubusercontent.com/SchemaStore/schemastore/master/src/schemas/json/jsconfig.json")
            .get(uri12 + "/jsconfig.json")
            .check(bodyBytes().is(RawFileBody("siigo/regresin/0035_response.txt"))),
          http("request_36:GET_https://raw.githubusercontent.com/SchemaStore/schemastore/master/src/schemas/json/tsconfig.json")
            .get(uri12 + "/tsconfig.json")
            .check(bodyBytes().is(RawFileBody("siigo/regresin/0036_response.txt"))),
          http("request_37:POST_https://m.stripe.com/6")
            .post(uri06)
            .headers(headers_11)
            .body(RawFileBody("siigo/regresin/0037_request.json"))
            .check(bodyBytes().is(RawFileBody("siigo/regresin/0037_response.json")))
        )
    )
    .pause(60)
    .exec(
      http("request_38:GET_https://reqres.in/api/users?page=2")
        .get("/api/users?page=2")
        .check(bodyBytes().is(RawFileBody("siigo/regresin/0038_response.json")))
    );

  {
	  setUp(scn.injectOpen(atOnceUsers(1))).protocols(httpProtocol);
  }
}
