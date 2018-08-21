<section class="content">

	<div class="col-md-6">
		<div class="box">
			<div class="box-header">
				<h3 class="box-title">Product Categories</h3>
				
				
				<a class="btn btn-block btn-primary btn-flat"
				href="${pageContext.request.contextPath}/AddProductCategory">Create
				</a>
				
				
			</div>
			<div class="box-body no-padding">
				<table class="table">
					<tr>
						<th style="width: 60px">Id</th>
						<th style="width: 60px">Category Name</th>
						<th style="width: 40px">Action</th>

					</tr>


					<c:forEach items="${productCategories}" var="productCategory">
						<tr>
							<td>${productCategory.id }</td>
							<td>${productCategory.categoryName }</td>
						<td><a class="btn btn-block btn-danger btn-sm"
				href="${pageContext.request.contextPath}/DeleteProductCategory?categoryId=${productCategory.id}">delete
				</a></td>
						
						
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
</section>