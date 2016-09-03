<%@ page language="java" contentType="text/html; UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="content container">
    <section id="top">
    	<div class="page-header">
    	<h1>Top Guests and Artists</h1>
    	</div>
        
        <div class="grid row">
        <c:forEach items="${tops}" var="entry">
            <div class="col-xs-6 col-md-3">
                <div class="thumbnail">
                    <img src="${entry.value.image }" alt="${entry.value.name } image">
                    <div class="caption text-center">
                        <h3><a href="search?search=${entry.value.name }&filters=byguest">${entry.value.name }</a></h3>
                    </div>
                </div>
            </div>
		</c:forEach>
        </div>
    </section>
</div>
<script src="https://unpkg.com/masonry-layout@4.1/dist/masonry.pkgd.min.js"></script>
<script src="https://unpkg.com/imagesloaded@4.1/imagesloaded.pkgd.min.js"></script>
<script src="./js/cascadingrid.js"></script>
