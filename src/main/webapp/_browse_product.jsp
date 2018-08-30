<div>


		<div class="form-group">
			<label for="exampleInputPassword1">Select Category</label> 
			<select
				name="category_name" id="categoryName">


				<option value="">Please Select</option>

				<c:forEach items="${productCategories}" var="p">
					<option value="${p.id }">${p.categoryName }</option>
				</c:forEach>


			</select>
		</div>

</div>	


<div id="productContent">


</div>