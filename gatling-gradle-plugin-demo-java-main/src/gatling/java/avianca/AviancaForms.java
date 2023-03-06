package avianca;

import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class AviancaForms extends Simulation {

  private HttpProtocolBuilder httpProtocol = http
          .baseUrl("https://api-digital.avianca.com")
          .inferHtmlResources(AllowList(), DenyList(".*\\.js", ".*\\.css", ".*\\.gif", ".*\\.jpeg", ".*\\.jpg", ".*\\.ico", ".*\\.woff", ".*\\.woff2", ".*\\.(t|o)tf", ".*\\.png", ".*\\.svg", ".*detectportal\\.firefox\\.com.*"))
          .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.0.0 Safari/537.36");

  private Map<CharSequence, String> headers_0 = Map.ofEntries(
          Map.entry("accept", "*/*"),
          Map.entry("accept-encoding", "gzip, deflate, br"),
          Map.entry("accept-language", "es-US,es-419;q=0.9,es;q=0.8"),
          Map.entry("access-control-request-headers", "authorization,ocp-apim-subscription-key"),
          Map.entry("access-control-request-method", "POST"),
          Map.entry("origin", "https://www.avianca.com"),
          Map.entry("sec-fetch-dest", "empty"),
          Map.entry("sec-fetch-mode", "cors"),
          Map.entry("sec-fetch-site", "same-site")
  );

  private Map<CharSequence, String> headers_4 = Map.ofEntries(
          Map.entry("accept", "*/*"),
          Map.entry("accept-encoding", "gzip, deflate, br"),
          Map.entry("accept-language", "es-US,es-419;q=0.9,es;q=0.8"),
          Map.entry("access-control-request-headers", "authorization,flow,ocp-apim-subscription-key"),
          Map.entry("access-control-request-method", "GET"),
          Map.entry("origin", "https://www.avianca.com"),
          Map.entry("sec-fetch-dest", "empty"),
          Map.entry("sec-fetch-mode", "cors"),
          Map.entry("sec-fetch-site", "cross-site")
  );

  private Map<CharSequence, String> headers_5 = Map.ofEntries(
          Map.entry("accept", "*/*"),
          Map.entry("accept-encoding", "gzip, deflate, br"),
          Map.entry("accept-language", "es-US,es-419;q=0.9,es;q=0.8"),
          Map.entry("authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6Ii1LSTNROW5OUjdiUm9meG1lWm9YcWJIWkdldyIsImtpZCI6Ii1LSTNROW5OUjdiUm9meG1lWm9YcWJIWkdldyJ9.eyJhdWQiOiJhcGk6Ly9lMWRhZTRhMy1jYWEwLTRmNWEtYmIzMy04NTAyMmM5YjYwNDMiLCJpc3MiOiJodHRwczovL3N0cy53aW5kb3dzLm5ldC9hMmFkZGQzZS04Mzk3LTQ1NzktYmEzMC03YTM4ODAzZmMzYmYvIiwiaWF0IjoxNjc4MDY3NzAwLCJuYmYiOjE2NzgwNjc3MDAsImV4cCI6MTY3ODA3MTYwMCwiYWlvIjoiRTJaZ1lEZzR0YWoyc1YzQThuRHJNMExXUmJVTkFBPT0iLCJhcHBpZCI6ImUxZGFlNGEzLWNhYTAtNGY1YS1iYjMzLTg1MDIyYzliNjA0MyIsImFwcGlkYWNyIjoiMSIsImlkcCI6Imh0dHBzOi8vc3RzLndpbmRvd3MubmV0L2EyYWRkZDNlLTgzOTctNDU3OS1iYTMwLTdhMzg4MDNmYzNiZi8iLCJvaWQiOiJiYjZmZjIwYy1jNWU2LTRiODAtYjkyZC00YTdhNzllMTA3MDkiLCJyaCI6IjAuQVNVQVB0MnRvcGVEZVVXNk1IbzRnRF9EdjZQazJ1R2d5bHBQdXpPRkFpeWJZRU1sQUFBLiIsInN1YiI6ImJiNmZmMjBjLWM1ZTYtNGI4MC1iOTJkLTRhN2E3OWUxMDcwOSIsInRpZCI6ImEyYWRkZDNlLTgzOTctNDU3OS1iYTMwLTdhMzg4MDNmYzNiZiIsInV0aSI6IkVwY1otdGZfa2t1dWtTeC1ESXpUQVEiLCJ2ZXIiOiIxLjAifQ.edT3L8kYyiuJVNMwC8opHhcukK2E2CnwSUbWoWmOlH-sYpehF1Be3gtko_Xv9NF-kX4Za6FfuFaa2eUgi0vKJacIFdrRWgCnUBW-UWZLY6HOEovtqzEdhXs0jmYGrcUmc0EiEBFEKiFpRVKO_5fmTiqiFXUPSSClhSAE_2M-1Or7FaMj_-PLn4K_1gfDyJTHnIsq1OJzgGHvwgNXk92jd9V-0mGD8YyO_gqV928Bs-4OlGrifcaMn0Q_3ml6fQ5uFiTsHSt8_uWk9EBRwzODu21LURxYFq5R5WX9Zn6oGsVDmLQLJILJHiQ-gtuynpQOHNAZpOw7qKpQdVuzRBdQCQ"),
          Map.entry("dnt", "1"),
          Map.entry("flow", "Amadeus"),
          Map.entry("ocp-apim-subscription-key", "b864c3e82cae4235a65a1bc0d3c0c4cc"),
          Map.entry("origin", "https://www.avianca.com"),
          Map.entry("sec-ch-ua", "Chromium\";v=\"110\", \"Not A(Brand\";v=\"24\", \"Google Chrome\";v=\"110"),
          Map.entry("sec-ch-ua-mobile", "?0"),
          Map.entry("sec-ch-ua-platform", "Windows"),
          Map.entry("sec-fetch-dest", "empty"),
          Map.entry("sec-fetch-mode", "cors"),
          Map.entry("sec-fetch-site", "cross-site")
  );

  private Map<CharSequence, String> headers_6 = Map.ofEntries(
          Map.entry("DNT", "1"),
          Map.entry("Flow", "Amadeus"),
          Map.entry("Ocp-Apim-Subscription-Key", "b864c3e82cae4235a65a1bc0d3c0c4cc"),
          Map.entry("authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6Ii1LSTNROW5OUjdiUm9meG1lWm9YcWJIWkdldyIsImtpZCI6Ii1LSTNROW5OUjdiUm9meG1lWm9YcWJIWkdldyJ9.eyJhdWQiOiJhcGk6Ly9lMWRhZTRhMy1jYWEwLTRmNWEtYmIzMy04NTAyMmM5YjYwNDMiLCJpc3MiOiJodHRwczovL3N0cy53aW5kb3dzLm5ldC9hMmFkZGQzZS04Mzk3LTQ1NzktYmEzMC03YTM4ODAzZmMzYmYvIiwiaWF0IjoxNjc4MDY3NzAwLCJuYmYiOjE2NzgwNjc3MDAsImV4cCI6MTY3ODA3MTYwMCwiYWlvIjoiRTJaZ1lEZzR0YWoyc1YzQThuRHJNMExXUmJVTkFBPT0iLCJhcHBpZCI6ImUxZGFlNGEzLWNhYTAtNGY1YS1iYjMzLTg1MDIyYzliNjA0MyIsImFwcGlkYWNyIjoiMSIsImlkcCI6Imh0dHBzOi8vc3RzLndpbmRvd3MubmV0L2EyYWRkZDNlLTgzOTctNDU3OS1iYTMwLTdhMzg4MDNmYzNiZi8iLCJvaWQiOiJiYjZmZjIwYy1jNWU2LTRiODAtYjkyZC00YTdhNzllMTA3MDkiLCJyaCI6IjAuQVNVQVB0MnRvcGVEZVVXNk1IbzRnRF9EdjZQazJ1R2d5bHBQdXpPRkFpeWJZRU1sQUFBLiIsInN1YiI6ImJiNmZmMjBjLWM1ZTYtNGI4MC1iOTJkLTRhN2E3OWUxMDcwOSIsInRpZCI6ImEyYWRkZDNlLTgzOTctNDU3OS1iYTMwLTdhMzg4MDNmYzNiZiIsInV0aSI6IkVwY1otdGZfa2t1dWtTeC1ESXpUQVEiLCJ2ZXIiOiIxLjAifQ.edT3L8kYyiuJVNMwC8opHhcukK2E2CnwSUbWoWmOlH-sYpehF1Be3gtko_Xv9NF-kX4Za6FfuFaa2eUgi0vKJacIFdrRWgCnUBW-UWZLY6HOEovtqzEdhXs0jmYGrcUmc0EiEBFEKiFpRVKO_5fmTiqiFXUPSSClhSAE_2M-1Or7FaMj_-PLn4K_1gfDyJTHnIsq1OJzgGHvwgNXk92jd9V-0mGD8YyO_gqV928Bs-4OlGrifcaMn0Q_3ml6fQ5uFiTsHSt8_uWk9EBRwzODu21LURxYFq5R5WX9Zn6oGsVDmLQLJILJHiQ-gtuynpQOHNAZpOw7qKpQdVuzRBdQCQ"),
          Map.entry("sec-ch-ua", "Chromium\";v=\"110\", \"Not A(Brand\";v=\"24\", \"Google Chrome\";v=\"110"),
          Map.entry("sec-ch-ua-mobile", "?0"),
          Map.entry("sec-ch-ua-platform", "Windows")
  );

  private Map<CharSequence, String> headers_9 = Map.ofEntries(
          Map.entry("accept", "*/*"),
          Map.entry("accept-encoding", "gzip, deflate, br"),
          Map.entry("accept-language", "es-US,es-419;q=0.9,es;q=0.8"),
          Map.entry("access-control-request-headers", "authorization,ocp-apim-subscription-key"),
          Map.entry("access-control-request-method", "GET"),
          Map.entry("origin", "https://www.avianca.com"),
          Map.entry("sec-fetch-dest", "empty"),
          Map.entry("sec-fetch-mode", "cors"),
          Map.entry("sec-fetch-site", "cross-site")
  );

  private Map<CharSequence, String> headers_10 = Map.ofEntries(
          Map.entry("DNT", "1"),
          Map.entry("Ocp-Apim-Subscription-Key", "b864c3e82cae4235a65a1bc0d3c0c4cc"),
          Map.entry("authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6Ii1LSTNROW5OUjdiUm9meG1lWm9YcWJIWkdldyIsImtpZCI6Ii1LSTNROW5OUjdiUm9meG1lWm9YcWJIWkdldyJ9.eyJhdWQiOiJhcGk6Ly9lMWRhZTRhMy1jYWEwLTRmNWEtYmIzMy04NTAyMmM5YjYwNDMiLCJpc3MiOiJodHRwczovL3N0cy53aW5kb3dzLm5ldC9hMmFkZGQzZS04Mzk3LTQ1NzktYmEzMC03YTM4ODAzZmMzYmYvIiwiaWF0IjoxNjc4MDY3NzAwLCJuYmYiOjE2NzgwNjc3MDAsImV4cCI6MTY3ODA3MTYwMCwiYWlvIjoiRTJaZ1lEZzR0YWoyc1YzQThuRHJNMExXUmJVTkFBPT0iLCJhcHBpZCI6ImUxZGFlNGEzLWNhYTAtNGY1YS1iYjMzLTg1MDIyYzliNjA0MyIsImFwcGlkYWNyIjoiMSIsImlkcCI6Imh0dHBzOi8vc3RzLndpbmRvd3MubmV0L2EyYWRkZDNlLTgzOTctNDU3OS1iYTMwLTdhMzg4MDNmYzNiZi8iLCJvaWQiOiJiYjZmZjIwYy1jNWU2LTRiODAtYjkyZC00YTdhNzllMTA3MDkiLCJyaCI6IjAuQVNVQVB0MnRvcGVEZVVXNk1IbzRnRF9EdjZQazJ1R2d5bHBQdXpPRkFpeWJZRU1sQUFBLiIsInN1YiI6ImJiNmZmMjBjLWM1ZTYtNGI4MC1iOTJkLTRhN2E3OWUxMDcwOSIsInRpZCI6ImEyYWRkZDNlLTgzOTctNDU3OS1iYTMwLTdhMzg4MDNmYzNiZiIsInV0aSI6IkVwY1otdGZfa2t1dWtTeC1ESXpUQVEiLCJ2ZXIiOiIxLjAifQ.edT3L8kYyiuJVNMwC8opHhcukK2E2CnwSUbWoWmOlH-sYpehF1Be3gtko_Xv9NF-kX4Za6FfuFaa2eUgi0vKJacIFdrRWgCnUBW-UWZLY6HOEovtqzEdhXs0jmYGrcUmc0EiEBFEKiFpRVKO_5fmTiqiFXUPSSClhSAE_2M-1Or7FaMj_-PLn4K_1gfDyJTHnIsq1OJzgGHvwgNXk92jd9V-0mGD8YyO_gqV928Bs-4OlGrifcaMn0Q_3ml6fQ5uFiTsHSt8_uWk9EBRwzODu21LURxYFq5R5WX9Zn6oGsVDmLQLJILJHiQ-gtuynpQOHNAZpOw7qKpQdVuzRBdQCQ"),
          Map.entry("sec-ch-ua", "Chromium\";v=\"110\", \"Not A(Brand\";v=\"24\", \"Google Chrome\";v=\"110"),
          Map.entry("sec-ch-ua-mobile", "?0"),
          Map.entry("sec-ch-ua-platform", "Windows")
  );

  private Map<CharSequence, String> headers_11 = Map.ofEntries(
          Map.entry("accept", "*/*"),
          Map.entry("accept-encoding", "gzip, deflate, br"),
          Map.entry("accept-language", "es-US,es-419;q=0.9,es;q=0.8"),
          Map.entry("authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6Ii1LSTNROW5OUjdiUm9meG1lWm9YcWJIWkdldyIsImtpZCI6Ii1LSTNROW5OUjdiUm9meG1lWm9YcWJIWkdldyJ9.eyJhdWQiOiJhcGk6Ly9lMWRhZTRhMy1jYWEwLTRmNWEtYmIzMy04NTAyMmM5YjYwNDMiLCJpc3MiOiJodHRwczovL3N0cy53aW5kb3dzLm5ldC9hMmFkZGQzZS04Mzk3LTQ1NzktYmEzMC03YTM4ODAzZmMzYmYvIiwiaWF0IjoxNjc4MDY3NzAwLCJuYmYiOjE2NzgwNjc3MDAsImV4cCI6MTY3ODA3MTYwMCwiYWlvIjoiRTJaZ1lEZzR0YWoyc1YzQThuRHJNMExXUmJVTkFBPT0iLCJhcHBpZCI6ImUxZGFlNGEzLWNhYTAtNGY1YS1iYjMzLTg1MDIyYzliNjA0MyIsImFwcGlkYWNyIjoiMSIsImlkcCI6Imh0dHBzOi8vc3RzLndpbmRvd3MubmV0L2EyYWRkZDNlLTgzOTctNDU3OS1iYTMwLTdhMzg4MDNmYzNiZi8iLCJvaWQiOiJiYjZmZjIwYy1jNWU2LTRiODAtYjkyZC00YTdhNzllMTA3MDkiLCJyaCI6IjAuQVNVQVB0MnRvcGVEZVVXNk1IbzRnRF9EdjZQazJ1R2d5bHBQdXpPRkFpeWJZRU1sQUFBLiIsInN1YiI6ImJiNmZmMjBjLWM1ZTYtNGI4MC1iOTJkLTRhN2E3OWUxMDcwOSIsInRpZCI6ImEyYWRkZDNlLTgzOTctNDU3OS1iYTMwLTdhMzg4MDNmYzNiZiIsInV0aSI6IkVwY1otdGZfa2t1dWtTeC1ESXpUQVEiLCJ2ZXIiOiIxLjAifQ.edT3L8kYyiuJVNMwC8opHhcukK2E2CnwSUbWoWmOlH-sYpehF1Be3gtko_Xv9NF-kX4Za6FfuFaa2eUgi0vKJacIFdrRWgCnUBW-UWZLY6HOEovtqzEdhXs0jmYGrcUmc0EiEBFEKiFpRVKO_5fmTiqiFXUPSSClhSAE_2M-1Or7FaMj_-PLn4K_1gfDyJTHnIsq1OJzgGHvwgNXk92jd9V-0mGD8YyO_gqV928Bs-4OlGrifcaMn0Q_3ml6fQ5uFiTsHSt8_uWk9EBRwzODu21LURxYFq5R5WX9Zn6oGsVDmLQLJILJHiQ-gtuynpQOHNAZpOw7qKpQdVuzRBdQCQ"),
          Map.entry("dnt", "1"),
          Map.entry("ocp-apim-subscription-key", "b864c3e82cae4235a65a1bc0d3c0c4cc"),
          Map.entry("origin", "https://www.avianca.com"),
          Map.entry("sec-ch-ua", "Chromium\";v=\"110\", \"Not A(Brand\";v=\"24\", \"Google Chrome\";v=\"110"),
          Map.entry("sec-ch-ua-mobile", "?0"),
          Map.entry("sec-ch-ua-platform", "Windows"),
          Map.entry("sec-fetch-dest", "empty"),
          Map.entry("sec-fetch-mode", "cors"),
          Map.entry("sec-fetch-site", "cross-site")
  );

  private Map<CharSequence, String> headers_25 = Map.ofEntries(
          Map.entry("accept", "*/*"),
          Map.entry("accept-encoding", "gzip, deflate, br"),
          Map.entry("accept-language", "es-US,es-419;q=0.9,es;q=0.8"),
          Map.entry("dnt", "1"),
          Map.entry("sec-ch-ua", "Chromium\";v=\"110\", \"Not A(Brand\";v=\"24\", \"Google Chrome\";v=\"110"),
          Map.entry("sec-ch-ua-mobile", "?0"),
          Map.entry("sec-ch-ua-platform", "Windows"),
          Map.entry("sec-fetch-dest", "empty"),
          Map.entry("sec-fetch-mode", "cors"),
          Map.entry("sec-fetch-site", "same-origin")
  );

  private Map<CharSequence, String> headers_26 = Map.ofEntries(
          Map.entry("DNT", "1"),
          Map.entry("sec-ch-ua", "Chromium\";v=\"110\", \"Not A(Brand\";v=\"24\", \"Google Chrome\";v=\"110"),
          Map.entry("sec-ch-ua-mobile", "?0"),
          Map.entry("sec-ch-ua-platform", "Windows")
  );

  private Map<CharSequence, String> headers_29 = Map.ofEntries(
          Map.entry("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7"),
          Map.entry("accept-encoding", "gzip, deflate, br"),
          Map.entry("accept-language", "es-US,es-419;q=0.9,es;q=0.8"),
          Map.entry("dnt", "1"),
          Map.entry("sec-ch-ua", "Chromium\";v=\"110\", \"Not A(Brand\";v=\"24\", \"Google Chrome\";v=\"110"),
          Map.entry("sec-ch-ua-mobile", "?0"),
          Map.entry("sec-ch-ua-platform", "Windows"),
          Map.entry("sec-fetch-dest", "document"),
          Map.entry("sec-fetch-mode", "navigate"),
          Map.entry("sec-fetch-site", "same-site"),
          Map.entry("sec-fetch-user", "?1"),
          Map.entry("upgrade-insecure-requests", "1")
  );

  private Map<CharSequence, String> headers_30 = Map.ofEntries(
          Map.entry("accept", "*/*"),
          Map.entry("accept-encoding", "gzip, deflate, br"),
          Map.entry("accept-language", "es-US,es-419;q=0.9,es;q=0.8"),
          Map.entry("dnt", "1"),
          Map.entry("sec-ch-ua", "Chromium\";v=\"110\", \"Not A(Brand\";v=\"24\", \"Google Chrome\";v=\"110"),
          Map.entry("sec-ch-ua-mobile", "?0"),
          Map.entry("sec-ch-ua-platform", "Windows"),
          Map.entry("sec-fetch-dest", "script"),
          Map.entry("sec-fetch-mode", "no-cors"),
          Map.entry("sec-fetch-site", "same-origin")
  );

  private Map<CharSequence, String> headers_31 = Map.ofEntries(
          Map.entry("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8"),
          Map.entry("accept-encoding", "gzip, deflate, br"),
          Map.entry("accept-language", "es-US,es-419;q=0.9,es;q=0.8"),
          Map.entry("dnt", "1"),
          Map.entry("sec-ch-ua", "Chromium\";v=\"110\", \"Not A(Brand\";v=\"24\", \"Google Chrome\";v=\"110"),
          Map.entry("sec-ch-ua-mobile", "?0"),
          Map.entry("sec-ch-ua-platform", "Windows"),
          Map.entry("sec-fetch-dest", "image"),
          Map.entry("sec-fetch-mode", "no-cors"),
          Map.entry("sec-fetch-site", "same-origin")
  );

  private Map<CharSequence, String> headers_32 = Map.ofEntries(
          Map.entry("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7"),
          Map.entry("accept-encoding", "gzip, deflate, br"),
          Map.entry("accept-language", "es-US,es-419;q=0.9,es;q=0.8"),
          Map.entry("dnt", "1"),
          Map.entry("sec-ch-ua", "Chromium\";v=\"110\", \"Not A(Brand\";v=\"24\", \"Google Chrome\";v=\"110"),
          Map.entry("sec-ch-ua-mobile", "?0"),
          Map.entry("sec-ch-ua-platform", "Windows"),
          Map.entry("sec-fetch-dest", "iframe"),
          Map.entry("sec-fetch-mode", "navigate"),
          Map.entry("sec-fetch-site", "same-origin"),
          Map.entry("upgrade-insecure-requests", "1")
  );

  private Map<CharSequence, String> headers_35 = Map.ofEntries(
          Map.entry("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7"),
          Map.entry("accept-encoding", "gzip, deflate, br"),
          Map.entry("accept-language", "es-US,es-419;q=0.9,es;q=0.8"),
          Map.entry("dnt", "1"),
          Map.entry("sec-ch-ua", "Chromium\";v=\"110\", \"Not A(Brand\";v=\"24\", \"Google Chrome\";v=\"110"),
          Map.entry("sec-ch-ua-mobile", "?0"),
          Map.entry("sec-ch-ua-platform", "Windows"),
          Map.entry("sec-fetch-dest", "document"),
          Map.entry("sec-fetch-mode", "navigate"),
          Map.entry("sec-fetch-site", "same-origin"),
          Map.entry("upgrade-insecure-requests", "1")
  );

  private Map<CharSequence, String> headers_39 = Map.ofEntries(
          Map.entry("accept", "*/*"),
          Map.entry("accept-encoding", "gzip, deflate, br"),
          Map.entry("accept-language", "es-US,es-419;q=0.9,es;q=0.8"),
          Map.entry("access-control-request-headers", "content-type,ocp-apim-subscription-key"),
          Map.entry("access-control-request-method", "POST"),
          Map.entry("origin", "https://booking.avianca.com"),
          Map.entry("sec-fetch-dest", "empty"),
          Map.entry("sec-fetch-mode", "cors"),
          Map.entry("sec-fetch-site", "same-site")
  );

  private Map<CharSequence, String> headers_40 = Map.ofEntries(
          Map.entry("accept", "application/json, text/plain, */*"),
          Map.entry("accept-encoding", "gzip, deflate, br"),
          Map.entry("accept-language", "es-US,es-419;q=0.9,es;q=0.8"),
          Map.entry("dnt", "1"),
          Map.entry("sec-ch-ua", "Chromium\";v=\"110\", \"Not A(Brand\";v=\"24\", \"Google Chrome\";v=\"110"),
          Map.entry("sec-ch-ua-mobile", "?0"),
          Map.entry("sec-ch-ua-platform", "Windows"),
          Map.entry("sec-fetch-dest", "empty"),
          Map.entry("sec-fetch-mode", "cors"),
          Map.entry("sec-fetch-site", "same-origin")
  );

  private Map<CharSequence, String> headers_55 = Map.ofEntries(
          Map.entry("accept", "*/*"),
          Map.entry("accept-encoding", "gzip, deflate, br"),
          Map.entry("accept-language", "es-US,es-419;q=0.9,es;q=0.8"),
          Map.entry("content-type", "application/x-www-form-urlencoded;charset=UTF-8"),
          Map.entry("dnt", "1"),
          Map.entry("origin", "https://booking.avianca.com"),
          Map.entry("sec-ch-ua", "Chromium\";v=\"110\", \"Not A(Brand\";v=\"24\", \"Google Chrome\";v=\"110"),
          Map.entry("sec-ch-ua-mobile", "?0"),
          Map.entry("sec-ch-ua-platform", "Windows"),
          Map.entry("sec-fetch-dest", "empty"),
          Map.entry("sec-fetch-mode", "cors"),
          Map.entry("sec-fetch-site", "same-site")
  );

  private Map<CharSequence, String> headers_57 = Map.ofEntries(
          Map.entry("accept", "*/*"),
          Map.entry("accept-encoding", "gzip, deflate, br"),
          Map.entry("accept-language", "es-US,es-419;q=0.9,es;q=0.8"),
          Map.entry("access-control-request-headers", "ama-client-ref,authorization,content-type,x-d-token"),
          Map.entry("access-control-request-method", "POST"),
          Map.entry("origin", "https://booking.avianca.com"),
          Map.entry("sec-fetch-dest", "empty"),
          Map.entry("sec-fetch-mode", "cors"),
          Map.entry("sec-fetch-site", "same-site")
  );

  private Map<CharSequence, String> headers_60 = Map.ofEntries(
          Map.entry("accept", "*/*"),
          Map.entry("accept-encoding", "gzip, deflate, br"),
          Map.entry("accept-language", "es-US,es-419;q=0.9,es;q=0.8"),
          Map.entry("access-control-request-headers", "ama-client-ref,authorization,content-type"),
          Map.entry("access-control-request-method", "POST"),
          Map.entry("origin", "https://booking.avianca.com"),
          Map.entry("sec-fetch-dest", "empty"),
          Map.entry("sec-fetch-mode", "cors"),
          Map.entry("sec-fetch-site", "same-site")
  );

  private String uri1 = "https://controller.avianca.com/api/redirectBookingFlow";

  private String uri3 = "https://booking.avianca.com";

  private String uri4 = "https://az-am-dig2-use-prd.azure-api.net/API_Birchman";

  private String uri5 = "https://www.avianca.com/bin";

  private String uri6 = "https://apibooking.avianca.com";

  private ScenarioBuilder scn = scenario("AviancaForms")
          .exec(
                  http("request_0")
                          .options("/API_CanalesDigitales/consultacombinabilidad")
                          .headers(headers_0)
          )
          .pause(5)
          .exec(
                  http("request_2")
                          .options("/API_CanalesDigitales/consultacombinabilidad")
                          .headers(headers_0)
                          .resources(
                                  http("request_4")
                                          .options(uri4 + "/flightsSchedule?routes=BOG-MDE")
                                          .headers(headers_4),
                                  http("request_5")
                                          .get(uri4 + "/flightsSchedule?routes=BOG-MDE")
                                          .headers(headers_5),
                                  http("request_6")
                                          .get(uri4 + "/flightsSchedule?routes=BOG-MDE")
                                          .headers(headers_6),
                                  http("request_7")
                                          .get(uri4 + "/flightsSchedule?routes=BOG-MDE")
                                          .headers(headers_5),
                                  http("request_8")
                                          .get(uri4 + "/flightsSchedule?routes=BOG-MDE")
                                          .headers(headers_6),
                                  http("request_9")
                                          .options(uri4 + "/v1/rt/routes")
                                          .headers(headers_9),
                                  http("request_10")
                                          .get(uri4 + "/v1/rt/routes")
                                          .headers(headers_10),
                                  http("request_11")
                                          .get(uri4 + "/v1/rt/routes")
                                          .headers(headers_11),
                                  http("request_12")
                                          .options(uri4 + "/v1/rt/cheapestPrices?tripType=RT&OriginCityCode=BOG&DestinationCityCode=MDE&POS=co&month=3&year=2023")
                                          .headers(headers_9),
                                  http("request_13")
                                          .get(uri4 + "/v1/rt/routes")
                                          .headers(headers_10),
                                  http("request_14")
                                          .get(uri4 + "/v1/rt/routes")
                                          .headers(headers_11),
                                  http("request_15")
                                          .get(uri4 + "/v1/rt/cheapestPrices?tripType=RT&OriginCityCode=BOG&DestinationCityCode=MDE&POS=co&month=3&year=2023")
                                          .headers(headers_11),
                                  http("request_16")
                                          .get(uri4 + "/v1/rt/cheapestPrices?tripType=RT&OriginCityCode=BOG&DestinationCityCode=MDE&POS=co&month=3&year=2023")
                                          .headers(headers_10),
                                  http("request_17")
                                          .get(uri4 + "/v1/rt/cheapestPrices?tripType=RT&OriginCityCode=BOG&DestinationCityCode=MDE&POS=co&month=3&year=2023")
                                          .headers(headers_11),
                                  http("request_18")
                                          .get(uri4 + "/v1/rt/cheapestPrices?tripType=RT&OriginCityCode=BOG&DestinationCityCode=MDE&POS=co&month=3&year=2023")
                                          .headers(headers_10)
                          )
          )
          .pause(4)
          .exec(
                  http("request_19")
                          .options(uri4 + "/flightsSchedule?routes=MDE-BOG")
                          .headers(headers_4)
                          .resources(
                                  http("request_20")
                                          .get(uri4 + "/flightsSchedule?routes=MDE-BOG")
                                          .headers(headers_5),
                                  http("request_21")
                                          .get(uri4 + "/flightsSchedule?routes=MDE-BOG")
                                          .headers(headers_6),
                                  http("request_22")
                                          .options(uri4 + "/v1/rt/cheapestPricesOutboundDate?tripType=RT&OriginCityCode=BOG&DestinationCityCode=MDE&POS=co&month=3&year=2023&OutboundDate=20230310")
                                          .headers(headers_9),
                                  http("request_23")
                                          .get(uri4 + "/v1/rt/cheapestPricesOutboundDate?tripType=RT&OriginCityCode=BOG&DestinationCityCode=MDE&POS=co&month=3&year=2023&OutboundDate=20230310")
                                          .headers(headers_10),
                                  http("request_24")
                                          .get(uri4 + "/v1/rt/cheapestPricesOutboundDate?tripType=RT&OriginCityCode=BOG&DestinationCityCode=MDE&POS=co&month=3&year=2023&OutboundDate=20230310")
                                          .headers(headers_11)
                          )
          )
          .pause(9)
          .exec(
                  http("request_25")
                          .get(uri5 + "/fmpd/calculate/?from=BOG&to=MDE&travelers=1&isFlight=true&country=co")
                          .headers(headers_25)
                          .resources(
                                  http("request_26")
                                          .get(uri5 + "/fmpd/calculate/?from=BOG&to=MDE&travelers=1&isFlight=true&country=co")
                                          .headers(headers_26),
                                  http("request_27")
                                          .get(uri5 + "/validateforbookingmessages?cco=BOG&fi=2023-03-10&ccd=MDE&fr=2023-03-19&cabina=0&Pais=CO&lan=ES&tv=true&na=1&nn=0&ni=0&VInt=no&data-messages-path=/content/avianca/co/es/cortinillas-del-booking&promo=true&friendlyId=&codigoInterno=")
                                          .headers(headers_25),
                                  http("request_28")
                                          .get(uri5 + "/validateforbookingmessages?cco=BOG&fi=2023-03-10&ccd=MDE&fr=2023-03-19&cabina=0&Pais=CO&lan=ES&tv=true&na=1&nn=0&ni=0&VInt=no&data-messages-path=/content/avianca/co/es/cortinillas-del-booking&promo=true&friendlyId=&codigoInterno=")
                                          .headers(headers_26),
                                  http("request_29")
                                          .get(uri1 + "?cco=BOG&ccd=MDE&fi=10MAR&fr=19MAR&FFL=false&na=1&nn=0&ni=0&vi=false&lan=ES&tt=4&Pais=CO&ccorp=0&hvi=0&hvr=0&tarifa=0&Cabina=0&VInt=no&SistemaOrigen=AH&tv=true&WS=null&descq=0&Device=mobile&FriendlyID=&FriendlyIDNegoF=")
                                          .headers(headers_29),
                                  http("request_30")
                                          .get(uri3 + "/_Incapsula_Resource?SWJIYLWA=719d34d31c8e3a6e6fffd425f7e032f3")
                                          .headers(headers_30),
                                  http("request_31")
                                          .get(uri3 + "/_Incapsula_Resource?SWKMTFSR=1&e=0.4464950640749923")
                                          .headers(headers_31),
                                  http("request_32")
                                          .get(uri3 + "/_Incapsula_Resource?CWUDNSAI=42&xinfo=18-9335248-0%20PNNN%20RT%281678068903539%208%29%20q%280%20-1%20-1%200%29%20r%283%20-1%29%20B10%2814%2c0%2c0%29%20U18&incident_id=8224000370005940272-42422260104956242&edet=10&cinfo=0e000000be59&rpinfo=0&mth=GET")
                                          .headers(headers_32),
                                  http("request_33")
                                          .get(uri3 + "/myling-wherson-of-our-shoole-Pall-purgatifull-th")
                                          .headers(headers_30),
                                  http("request_35")
                                          .get(uri3 + "/av/booking/avail?departureDate=2023-03-10&tripType=round-trip&from=BOG&to=MDE&nbAdults=1&nbChildren=0&nbInfants=0&language=ES&platform=WEBB2C&pointOfSale=CO&returnDate=2023-03-19&promoCode=&negoFare=&overrides=%7B%22enableFlexCancelTeaser%22%3A%22true%22%2C%22useHPP%22%3A%22true%22%7D&accessMethod=default&backend=PRD")
                                          .headers(headers_35),
                                  http("request_36")
                                          .get(uri3 + "/myling-wherson-of-our-shoole-Pall-purgatifull-th")
                                          .headers(headers_26),
                                  http("request_38")
                                          .get(uri3 + "/statics/applications/booking/dist/2301.3.21/localizations/en.json")
                                          .headers(headers_25),
                                  http("request_39")
                                          .options("/API_CanalesDigitales/autorizacion")
                                          .headers(headers_39),
                                  http("request_40")
                                          .get(uri3 + "/statics/applications/booking/dist/2301.3.21/assets/config/locations/locations.en.json")
                                          .headers(headers_40),
                                  http("request_41")
                                          .get(uri3 + "/statics/applications/booking/dist/2301.3.21/assets/config/locations/locations.es.json")
                                          .headers(headers_40),
                                  http("request_42")
                                          .options("/API_CanalesDigitales/autorizacion")
                                          .headers(headers_39),
                                  http("request_43")
                                          .get(uri3 + "/statics/applications/booking/dist/2301.3.21/assets/config/locations/locations.pt.json")
                                          .headers(headers_40),
                                  http("request_44")
                                          .get(uri3 + "/statics/applications/booking/dist/2301.3.21/assets/config/locations/city-utc-offset.json")
                                          .headers(headers_40),
                                  http("request_45")
                                          .get(uri3 + "/statics/applications/booking/dist/2301.3.21/localizations/es.json")
                                          .headers(headers_25),
                                  http("request_55")
                                          .post(uri6 + "/v1/security/oauth2/token")
                                          .headers(headers_55)
                                          .formParam("client_id", "GcO04fj3BtViLGH4b5HGxfQPNxIn0VqV")
                                          .formParam("client_secret", "oVKGTlg90l5uRr6l")
                                          .formParam("grant_type", "client_credentials")
                                          .formParam("guest_office_id", "BOGAV08AK"),
                                  http("request_56")
                                          .post(uri6 + "/v1/security/oauth2/token")
                                          .headers(headers_55)
                                          .formParam("client_id", "GcO04fj3BtViLGH4b5HGxfQPNxIn0VqV")
                                          .formParam("client_secret", "oVKGTlg90l5uRr6l")
                                          .formParam("grant_type", "client_credentials")
                                          .formParam("guest_office_id", "BOGAV08AK"),
                                  http("request_57")
                                          .options(uri6 + "/v2/search/air-calendars")
                                          .headers(headers_57),
                                  http("request_58")
                                          .options(uri6 + "/v2/search/air-bounds")
                                          .headers(headers_57),
                                  http("request_60")
                                          .options(uri6 + "/v2/digital-touchpoints/CustomDES/analytics/user-experience-logs")
                                          .headers(headers_60)
                          )
          );

  {
    setUp(scn.injectOpen(atOnceUsers(1))).protocols(httpProtocol);
  }
}
