package com.ziv.netplayer.func;

/**
 * Created by ziv on 2017/9/2.
 */

//public class RxJavaRetrofit implements Common {
//    private String result;
//    @Override
//    public String getMovieInfo() {
//        String baseUrl = "https://api.douban.com/v2/movie/";
//
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl(baseUrl)
//                .addConverterFactory(GsonConverterFactory.create())
//                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
//                .build();
//
//        MovieService movieService = retrofit.create(MovieService.class);
//        movieService.getTopMovieRxJavaRetrofit(0, 10)
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Subscriber<MovieEntity>(){
//                    @Override
//                    public void onNext(MovieEntity movieEntity) {
//
//                    }
//
//                    @Override
//                    public void onError(Throwable t) {
//
//                    }
//
//                    @Override
//                    public void onComplete() {
//
//                    }
//                });
//
//
//        return result;
//    }
//}
