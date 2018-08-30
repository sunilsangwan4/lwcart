<section class="content">


	<div class="box">
		<div class="box-header">
			<h3 class="box-title">Products</h3>



		</div>
		<div class="box-body no-padding">
			<table class="table">
				<tr>
					<th style="width: 60px">Id</th>
					<th style="width: 60px">Product Code</th>
					<th style="width: 40px">Price</th>
					<th style="width: 60px">Category Name</th>
					<th style="width: 60px">Discription</th>
					<th style="width: 40px">Image Path</th>
					<th style="width: 40px">Action</th>


				</tr>


				<c:forEach items="${products}" var="plist">
					<tr>
						<td>${plist.id }</td>
						<td>${plist.pCode }</td>

						<td>${plist.pPrice }</td>


						<td>${plist.categoryName }</td>
						<td>${plist.pDiscription }</td>
						<td><img src="file://${plist.pPath } " />
							</td>



						<td><a class="btn btn-block btn-danger btn-sm"
							href="${pageContext.request.contextPath}/DeleteProduct?productId=${plist.id}">delete
						</a></td>


					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</section>