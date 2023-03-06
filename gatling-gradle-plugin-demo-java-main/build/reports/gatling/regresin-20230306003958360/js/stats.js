var stats = {
    type: "GROUP",
name: "All Requests",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "All Requests",
    "numberOfRequests": {
        "total": "2",
        "ok": "0",
        "ko": "2"
    },
    "minResponseTime": {
        "total": "57",
        "ok": "-",
        "ko": "57"
    },
    "maxResponseTime": {
        "total": "241",
        "ok": "-",
        "ko": "241"
    },
    "meanResponseTime": {
        "total": "149",
        "ok": "-",
        "ko": "149"
    },
    "standardDeviation": {
        "total": "92",
        "ok": "-",
        "ko": "92"
    },
    "percentiles1": {
        "total": "149",
        "ok": "-",
        "ko": "149"
    },
    "percentiles2": {
        "total": "195",
        "ok": "-",
        "ko": "195"
    },
    "percentiles3": {
        "total": "232",
        "ok": "-",
        "ko": "232"
    },
    "percentiles4": {
        "total": "239",
        "ok": "-",
        "ko": "239"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 0,
    "percentage": 0
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 2,
    "percentage": 100
},
    "meanNumberOfRequestsPerSecond": {
        "total": "0.033",
        "ok": "-",
        "ko": "0.033"
    }
},
contents: {
"req_request-0-get-h-26c42": {
        type: "REQUEST",
        name: "request_0:GET_https://js.stripe.com/v3/",
path: "request_0:GET_https://js.stripe.com/v3/",
pathFormatted: "req_request-0-get-h-26c42",
stats: {
    "name": "request_0:GET_https://js.stripe.com/v3/",
    "numberOfRequests": {
        "total": "1",
        "ok": "0",
        "ko": "1"
    },
    "minResponseTime": {
        "total": "57",
        "ok": "-",
        "ko": "57"
    },
    "maxResponseTime": {
        "total": "57",
        "ok": "-",
        "ko": "57"
    },
    "meanResponseTime": {
        "total": "57",
        "ok": "-",
        "ko": "57"
    },
    "standardDeviation": {
        "total": "0",
        "ok": "-",
        "ko": "0"
    },
    "percentiles1": {
        "total": "57",
        "ok": "-",
        "ko": "57"
    },
    "percentiles2": {
        "total": "57",
        "ok": "-",
        "ko": "57"
    },
    "percentiles3": {
        "total": "57",
        "ok": "-",
        "ko": "57"
    },
    "percentiles4": {
        "total": "57",
        "ok": "-",
        "ko": "57"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 0,
    "percentage": 0
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 1,
    "percentage": 100
},
    "meanNumberOfRequestsPerSecond": {
        "total": "0.016",
        "ok": "-",
        "ko": "0.016"
    }
}
    },"req_request-38-get--d67e2": {
        type: "REQUEST",
        name: "request_38:GET_https://reqres.in/api/users?page=2",
path: "request_38:GET_https://reqres.in/api/users?page=2",
pathFormatted: "req_request-38-get--d67e2",
stats: {
    "name": "request_38:GET_https://reqres.in/api/users?page=2",
    "numberOfRequests": {
        "total": "1",
        "ok": "0",
        "ko": "1"
    },
    "minResponseTime": {
        "total": "241",
        "ok": "-",
        "ko": "241"
    },
    "maxResponseTime": {
        "total": "241",
        "ok": "-",
        "ko": "241"
    },
    "meanResponseTime": {
        "total": "241",
        "ok": "-",
        "ko": "241"
    },
    "standardDeviation": {
        "total": "0",
        "ok": "-",
        "ko": "0"
    },
    "percentiles1": {
        "total": "241",
        "ok": "-",
        "ko": "241"
    },
    "percentiles2": {
        "total": "241",
        "ok": "-",
        "ko": "241"
    },
    "percentiles3": {
        "total": "241",
        "ok": "-",
        "ko": "241"
    },
    "percentiles4": {
        "total": "241",
        "ok": "-",
        "ko": "241"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 0,
    "percentage": 0
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 1,
    "percentage": 100
},
    "meanNumberOfRequestsPerSecond": {
        "total": "0.016",
        "ok": "-",
        "ko": "0.016"
    }
}
    }
}

}

function fillStats(stat){
    $("#numberOfRequests").append(stat.numberOfRequests.total);
    $("#numberOfRequestsOK").append(stat.numberOfRequests.ok);
    $("#numberOfRequestsKO").append(stat.numberOfRequests.ko);

    $("#minResponseTime").append(stat.minResponseTime.total);
    $("#minResponseTimeOK").append(stat.minResponseTime.ok);
    $("#minResponseTimeKO").append(stat.minResponseTime.ko);

    $("#maxResponseTime").append(stat.maxResponseTime.total);
    $("#maxResponseTimeOK").append(stat.maxResponseTime.ok);
    $("#maxResponseTimeKO").append(stat.maxResponseTime.ko);

    $("#meanResponseTime").append(stat.meanResponseTime.total);
    $("#meanResponseTimeOK").append(stat.meanResponseTime.ok);
    $("#meanResponseTimeKO").append(stat.meanResponseTime.ko);

    $("#standardDeviation").append(stat.standardDeviation.total);
    $("#standardDeviationOK").append(stat.standardDeviation.ok);
    $("#standardDeviationKO").append(stat.standardDeviation.ko);

    $("#percentiles1").append(stat.percentiles1.total);
    $("#percentiles1OK").append(stat.percentiles1.ok);
    $("#percentiles1KO").append(stat.percentiles1.ko);

    $("#percentiles2").append(stat.percentiles2.total);
    $("#percentiles2OK").append(stat.percentiles2.ok);
    $("#percentiles2KO").append(stat.percentiles2.ko);

    $("#percentiles3").append(stat.percentiles3.total);
    $("#percentiles3OK").append(stat.percentiles3.ok);
    $("#percentiles3KO").append(stat.percentiles3.ko);

    $("#percentiles4").append(stat.percentiles4.total);
    $("#percentiles4OK").append(stat.percentiles4.ok);
    $("#percentiles4KO").append(stat.percentiles4.ko);

    $("#meanNumberOfRequestsPerSecond").append(stat.meanNumberOfRequestsPerSecond.total);
    $("#meanNumberOfRequestsPerSecondOK").append(stat.meanNumberOfRequestsPerSecond.ok);
    $("#meanNumberOfRequestsPerSecondKO").append(stat.meanNumberOfRequestsPerSecond.ko);
}
